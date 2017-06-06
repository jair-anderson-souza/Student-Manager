var app = angular.module("App", ["ngMessages", "ngRoute"]);

app.controller("AppCtrl",function($scope){
	
    $scope.genders = ["MALE",  "FEMALE"];
});

app.config(function ($routeProvider) {
    
    $routeProvider.when("/list", {
        templateUrl: "src/webapp/views/list.html",
        controller: "ListCtrl"
    }).when("/new", {
        templateUrl: "src/webapp/views/new.html",
        controller: "NewCtrl"
    });
});




