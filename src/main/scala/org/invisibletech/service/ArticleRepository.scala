package  org.invisibletech.microblog.service

import org.springframework.data.jpa.repository.JpaRepository

import org.invisibletech.microblog.model.Article
import java.lang.Long

trait ArticleRepository extends JpaRepository[Article, Long]