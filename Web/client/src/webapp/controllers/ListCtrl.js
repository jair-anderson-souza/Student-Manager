var app = angular.module("App");

app.controller("ListCtrl", function ($scope, studentAPI) {

    var loadStudents = function () {
        studentAPI.students().then(function (response) {
            $scope.students = response.data;
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