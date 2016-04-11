package org.invisibletech.tinyblog.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.{ ControllerAdvice, ExceptionHandler, ResponseBody, ResponseStatus }

import scala.collection.JavaConverters._
import java.util.{ Map ⇒ JMap }

class RestError(val message: String, additionalInfoIn: Map[String, Object]) {
    // Because Scala accessors are not in compliance with Spring Bean properties.
    def getMessage = message

    def getAdditionalInfo = additionalInfoIn.asJava
}

class ArticleNotFoundException(val additionalInfo: Map[String, Object], msg: String, cause: Throwable = null) extends RuntimeException(msg, cause)

@ControllerAdvice
class RestErrorHandler {
  @ExceptionHandler(Array(classOf[ArticleNotFoundException]))
  @ResponseStatus(HttpStatus.NOT_FOUND)
  @ResponseBody
  def handleArticleNotFound(exception: ArticleNotFoundException): RestError = {
        new RestError(exception.getMessage, exception.additionalInfo)
  }
}