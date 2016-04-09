package org.invisibletech.microblog.controller

import java.lang.Long
import javax.validation.Valid

import org.invisibletech.microblog.model.Article
import org.invisibletech.microblog.service.ArticleRepository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult

import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.{ PathVariable, RequestMapping, RequestMethod }

@Controller
@RequestMapping(Array("/articles"))
class ArticleController @Autowired() (private val articleRepository: ArticleRepository) {

  @RequestMapping(method = Array(RequestMethod.GET))
  def list(model: Model) = {
    val articles = articleRepository.findAll()
    model.addAttribute("articles", articles)
    "articles/list"
  }

  @RequestMapping(Array("/edit/{id}"))
  def edit(@PathVariable("id") id: Long, model: Model) = {
    model.addAttribute("article", articleRepository.findOne(id))
    "articles/edit"
  }

  @RequestMapping(value = Array("/update"), method = Array(RequestMethod.POST))
  def update(@Valid article: Article, bindingResult: BindingResult) = {
    if (bindingResult.hasErrors()) {
      "articles/edit"
    } else {
      articleRepository.save(article)
      "redirect:/articles"
    }

  }    
}