app.controller('ArticleController',['$scope', function($scope) {
    $scope.articles = [
        {
            id: 1,
            title: 'The Book of Trees', 
            content: 'Long, long ago in a galaxy far, far away.  There lived an amphibious monstrosity named "Jar Jar Binks".' 
        }
    ];
}]);