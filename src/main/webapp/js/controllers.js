var app = angular.module('org.mjjaniec.tplinkWhip.controllers', []);

app.controller('WhipController', ['$scope', 'UserFactory', function ($scope, UserFactory) {
    UserFactory.get({}, function (userFactory) {
        $scope.name = userFactory.name;
    })
}]);