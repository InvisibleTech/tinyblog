app.controller('ArticleController',['$scope', 'ArticleService', function($scope, ArticleService) {
    // ArticleService.success(function(data) {
    //     $scope.articles = data;
    // });
    // Need to figure out delete.
    // $scope.deleteArticle = function(article) {
    //   article.$remove(function() {
    //     $scope.articles.splice($scope.articles.indexOf(article), 1);
    //   });
    // };
    $scope.articles = [];

    ArticleService.list(function (articles) {
        $scope.articles = articles;
    });

}]);