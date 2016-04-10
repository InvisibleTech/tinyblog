# tinyblog
A Tiny Blog Application using Spring Boot for the frameworks and Scala for the language.

# Why is the Commit Log So Full of Wreckage?
I considered doing the rest and commit cycle.  Then I decided that the point of this tutorial is to learn and share with others the why and not just the what.  For example, you'll see I originally started out with a lot of copied code for the Spring Boot Controller and the Angular Controller.  However, putting this much code in at once and simply refactoring it with no validation was a nightmare.  And I did not have any idea about Angular, Spring Boot, and Scala's edges with Spring Boot; therefor, I could not simply TDD my way through incrementally.

My approach was to comment out things on the UI and get a controller to render the model in the list with no worries about the backend.  Then I could focus on using a rest client to iteratively code, build, and test the REST endpoint.  This let me telescope the process of learning Spring Boot, Spring MVC, and navigate the rough edges where Scala and Java just don't see things the same way in an incremental fashion.  In effect I used rapid feedback without the fuss of formalizing the assertions and test setup.

# To run
java -jar target/tinyblog-1.0-SNAPSHOT.jar

# References
* https://spring.io/guides/gs/spring-boot/
* http://docs.spring.io/spring-boot/docs/1.3.3.RELEASE/reference/htmlsingle/#boot-documentation-first-steps
* https://www.codecademy.com/learn/learn-angularjs
* http://g00glen00b.be/prototyping-spring-boot-angularjs/
* https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku#creating-a-spring-boot-app
* http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-profiles.html
* http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html#boot-features-external-config-profile-specific-properties
