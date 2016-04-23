app.factory('ArticleService', ['$http', function($http) {
    return {
        list: function (successFunc) {
                        $http.get('http://localhost:8080/articles')
                            .success(function(data) {
                                successFunc(data);
                            });
        }
    };
}]);