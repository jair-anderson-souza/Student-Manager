var app = angular.module("App");


//Ver Valules

app.service("studentAPI", function($http, ConfigConstant){
	
	var _students = function(){
		return $http.get(ConfigConstant.baseUrl + "/student");
	};
	
	var _saveStudent = function(student){
		return $http.post(ConfigConstant.baseUrl + "/student", student);	
	};

	return {
		students: _students,
		saveStudent: _saveStudent
	};

});