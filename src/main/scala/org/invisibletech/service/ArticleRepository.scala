package  org.invisibletech.tinyblog.service

import org.springframework.data.jpa.repository.JpaRepository

import org.invisibletech.tinyblog.model.Article
import java.lang.Long

trait ArticleRepository extends JpaRepository[Article, Long]