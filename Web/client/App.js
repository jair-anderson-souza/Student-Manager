var app = angular.module("app", ["ngRoute"]);

app.config(function($routeProvider) {
	$routeProvider.when("/new", {
		templateUrl: "src/webapp/views/new.html",
		controller: "NewCtrl"
	}).when("/list", {
		templateUrl: "src/webapp/views/list.html",
		controller: "ListCtrl"
	});
});

app.controller("NewCtrl", function($scope){
	$scope.name = "New";
});

app.controller("ListCtrl", function($scope, ListService){
	$scope.students = ListService.getStudents();
});

app.service("ListService", function(){
	var students = [{
		name : "Anderson",
		age: "21"
	}];

	this.getStudents = function(){
		return students;
	};
})
/*
app.controller("NewCtrl", function($scope){
	$scope.name = "Anderson";
});

app.controller("NewCtrl", function($scope){
	$scope.name = "Anderson";
});*/