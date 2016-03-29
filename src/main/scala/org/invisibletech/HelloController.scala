package org.invisibletech

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class HelloController {
    @RequestMapping(Array("/"))
    def index(): String = {
         "Greetings from Spring Boot!"
    }
}