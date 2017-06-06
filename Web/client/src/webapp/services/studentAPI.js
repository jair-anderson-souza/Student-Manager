var app = angular.module("App");


//Ver Valules

app.factory("studentAPI", function($http){
	
	var _students = function(){
		return $http.get("http://localhost:8080/WebServices/webapi/student");
	};
	
	var _saveStudent = function(student){
		return $http.post("http://localhost:8080/WebServices/webapi/student", student);	
	};

	return {
		students: _students,
		saveStudent: _saveStudent
	};

});