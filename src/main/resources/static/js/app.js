var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/linkedin',{
            templateUrl: 'resources/static/views/linkedin.html',
            controller: 'linkedinController'
        })
        .when('/curriculumvitae',{
            templateUrl: 'resources/static/views/curriculum.html',
            controller: 'curriculumController'
        })
        .when('/contactus',{
            templateUrl: 'resources/static/views/contactus.html',
            controller: 'contactusController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});
