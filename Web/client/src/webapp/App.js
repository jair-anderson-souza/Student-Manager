var app = angular.module("App", ["ngRoute"]);

app.config(function($routeProvider) {
	$routeProvider.when("/new", {
		templateUrl: "src/webapp/views/new.html",
		controller: "NewCtrl"
	}).when("/list", {
		templateUrl: "src/webapp/views/list.html",
		controller: "ListCtrl"
	});
});



