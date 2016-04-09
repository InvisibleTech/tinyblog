package  org.invisibletech.microblog.service

import org.springframework.data.repository.CrudRepository
import org.invisibletech.microblog.model.Article
import java.lang.Long

trait ArticleRepository extends CrudRepository[Article, Long]