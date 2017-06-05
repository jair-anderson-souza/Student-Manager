var app = angular.module("App");

app.controller("NewCtrl", function ($scope, $http) {

    $scope.addStudent = function (student) {
        $scope.students.push(student);
        delete $scope.student;
        $scope.studentForm.$setPristine();
    };

    var loadStudents = function () {
        $http.get("http://localhost:8080/WebServices/webapi/student").then(function (response) {
            $scope.students = response.data;
            /**console.log(response.status);
             console.log(response.statusText);
             console.log(response.config);
             console.log(response.headers);**/
        }), function (response) {
            console.log("erro");
        };
    };

});