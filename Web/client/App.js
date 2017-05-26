var app = angular.module("app", ["ngRoute"]);

app.config(function($routeProvider) {
	$routeProvider.when("/new", {
		templateUrl: "src/webapp/views/new.html",
		controller: "NewCtrl"
	});
});

app.controller("NewCtrl", function($scope){
	$scope.name = "Anderson";
});