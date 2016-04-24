app.controller('ArticleController',['ArticleService', function(ArticleService) {
    var self = this;
    self.articles = [];
    self.newArticle = {};
    var fetchArticles = function () {
        self.articles = ArticleService.query();
    };

    fetchArticles();

    self.deleteArticle = function (article) {
        ArticleService.delete(article)
                    .$promise
                    .then(fetchArticles);
    };

    self.addArticle = function () {
       ArticleService.save(self.newArticle)
                .$promise
                .then(fetchArticles)
                .then(function () {
                   self.newArticle = {}; 
                });
    }
}]);