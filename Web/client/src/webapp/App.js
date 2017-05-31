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

app.controller("NewCtrl", function($scope, ListService){
	$scope.student = [];
	var student = $scope.student;
	$scope.add = ListService.addStudent(student);
});

app.controller("ListCtrl", function($scope, ListService){
	$scope.students = ListService.getStudents();
});

app.service("ListService", function(){
	var students = [{
		name : "Anderson",
		age: "21"
	}];

	this.addStudent = function(student){
		students.push(student);
	};

	this.getStudents = function(){
		return students;
	};
});
