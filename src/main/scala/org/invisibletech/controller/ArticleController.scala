package org.invisibletech.tinyblog.controller

import java.lang.Boolean
import java.lang.Long
import javax.validation.Valid

import org.invisibletech.tinyblog.model.Article
import org.invisibletech.tinyblog.service.ArticleRepository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.{ RestController, PathVariable, RequestMapping, RequestMethod, RequestBody }

@RestController
@RequestMapping(Array("/articles"))
class ArticleController @Autowired() (private val articleRepository: ArticleRepository) {
  @RequestMapping(method = Array(RequestMethod.GET))
  def list() = {
    articleRepository.findAll()
  }

  @RequestMapping(method = Array(RequestMethod.POST))
  def addArticle(@RequestBody() article: Article): Article = {
    article.setId(null)
    articleRepository.saveAndFlush(article)
  }

  @RequestMapping(value = Array("/{id}"), method = Array(RequestMethod.PUT))
  def updateArticle(@RequestBody() article: Article, @PathVariable() id: Long): Article = {
    // Trust but verify - use Option and orThrow
    Option(articleRepository.findOne(id)) match {
      case Some(found) => {
        article.id = found.id
        articleRepository.saveAndFlush(article)
      }
      case None => throw new ArticleNotFoundException(Map("id" -> id), "Article not found.")
    }
  }

  @RequestMapping(value = Array("/{id}"), method = Array(RequestMethod.DELETE))
  def deleteArticle(@PathVariable() id: Long) = {
    articleRepository.delete(id)

    // To make sure a 200 with NO CONTENT is not returned we do this.
    new ResponseEntity[Boolean](Boolean.TRUE, HttpStatus.NO_CONTENT)
  }
}