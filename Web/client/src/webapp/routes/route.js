var app = angular.module("App");

app.config(function($routeProvider){
	$routeProvider.when("/list", {
		templateUrl: "src/webapp/views/list.html",
		controller: "ListCtrl"
	}).when("/new", {
		templateUrl: "src/webapp/views/new.html",
		controller: "NewCtrl"
	});
});