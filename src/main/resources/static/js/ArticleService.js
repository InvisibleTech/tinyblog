app.factory('ArticleService', ['$http', function($http) {
        return $http.get('http://localhost:8080/articles')
                                .success(function(data) {
                                return data;
                                }).error(function(err) {
                                return err;
                                });
        }]);