package org.invisibletech.microblog.model

import javax.persistence.Id
import javax.persistence.GeneratedValue
import java.lang.Long
import javax.persistence.Entity
import scala.beans.BeanProperty
import org.hibernate.validator.constraints.NotEmpty

@Entity
class Article {
    @Id
    @GeneratedValue
    @BeanProperty
    var id: Long = _

    @BeanProperty
    @NotEmpty
    var title: String = _

    @BeanProperty
    @NotEmpty
    var content: String = _
    
}