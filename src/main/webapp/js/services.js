var services = angular.module('org.mjjaniec.tplinkWhip.services', ['ngResource']);

services.factory('UserFactory', function ($resource) {
    return $resource('/whip/users', {}, {
        query: {
            method: 'GET',
            params: {},
            isArray: false
        }
    })
});