var app = angular.module("App");

app.controller("ListCtrl", function ($scope, $http) {

    var loadStudents = function () {
        $http.get("http://localhost:8080/WebServices/webapi/student").then(function (response) {
            console.log(response.data);
            $scope.students = response.data;
            /**console.log(response.status);
             console.log(response.statusText);
             console.log(response.config);
             console.log(response.headers);**/
        }), function (response) {
            console.log("erro");
        };
    };

    loadStudents();

    $scope.orderBy = function (field) {
        console.log($scope.genders);
        $scope.orderedBy = field;
        $scope.inverse = !$scope.inverse;
    };
});