var app = angular.module("App");

app.controller("NewCtrl", function ($scope, studentAPI) {
    $scope.addStudent = function (student) {
        $scope.message = "";
        studentAPI.saveStudent(student).
            then(function(response){
                delete $scope.student;
                $scope.studentForm.$setPristine();
                $scope.message = "Successful";
            }), function(response){
                $scope.message = "Error on persist entity";
            };
        };
    
});