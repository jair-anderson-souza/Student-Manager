var app = angular.module("App", ["ngMessages", "ngRoute"]);

app.controller("AppCtrl",function($scope){
	$scope.students = [
        {id: 1, name: "Luana", cpf: "938723492-34", gender : "FEMALE", identifyNumber: "293874238423", militaryDocumentNumber: "8237483274", nacionality: "BRA", birthday: "04/03/2012"},
        {id: 1, name: "Anderson", cpf: "823782734-45", gender : "MALE", identifyNumber: "289374829374", militaryDocumentNumber: "2874683745", nacionality: "BRA", birthday: "10/10/2010"}
    ];
    $scope.genders = ["MALE",  "FEMALE"];
});

app.config(function ($routeProvider) {
    
    $routeProvider.when("/list", {
        templateUrl: "src/webapp/views/list.html",
        controller: "ListCtrl"
    }).when("/new", {
        templateUrl: "src/webapp/views/new.html",
        controller: "NewCtrl"
    });
});




