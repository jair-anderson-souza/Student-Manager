var app = angular.module("App");

app.controller("NewCtrl", function ($scope, studentAPI) {

    $scope.addStudent = function (student) {
        studentAPI.saveStudent(student).
            then(function(response){
                console.log(response.status);
                delete $scope.student;
                $scope.studentForm.$setPristine();
            }), function(response){
                console.log(response.status);
            };
        };
    
});