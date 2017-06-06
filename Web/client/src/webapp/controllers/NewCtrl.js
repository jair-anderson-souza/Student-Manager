var app = angular.module("App");

app.controller("NewCtrl", function ($scope, $http) {

    $scope.addStudent = function (student) {
        $http.post("http://localhost:8080/WebServices/webapi/student", student)
            .then(function(response){
                console.log(response.status);
                delete $scope.student;
                $scope.studentForm.$setPristine();
            }), function(response){
                console.log(response.status);
            };
        };
    
});