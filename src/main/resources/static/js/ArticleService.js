// http://localhost:8080/articles
app.factory('ArticleService', ['$resource',
    function($resource) {
        return $resource('/articles/:id',  {id: '@id'});
    }]);