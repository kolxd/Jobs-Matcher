app.controller('linkedinController', ['$scope', '$http', '$location', '$route', function ($scope, $http, $location, $route) {
    $scope.headingTitle = "Insert Linkedin profile";

    $scope.uploadFile = function () {
        $scope.change();
        var file = $scope.myFile;
        var uploadUrl = "/upload1";
        if (file != null) {
            var fd = new FormData();
            fd.append('file', file);
            $scope.myData = "";
            $http.post(uploadUrl, fd, {
                transformRequest: angular.identity,
                headers: {'Content-Type': undefined}
            })
                .success(function (data) {
                })
                .error(function (data) {

                });
        }
        else {
            $scope.fileIsEmpty = true;
        }
    }
}]);

app.controller('curriculumController', ['$scope', '$http', '$location', '$route', function ($scope, $http, $location, $route){
    $scope.headingTitle = "Insert CV profile";

    $scope.uploadFile = function () {
        $scope.change();
        var file = $scope.myFile;
        var uploadUrl = "/upload2";
        if (file != null) {
            var fd = new FormData();
            fd.append('file', file);
            $scope.myData = "";
            $http.post(uploadUrl, fd, {
                transformRequest: angular.identity,
                headers: {'Content-Type': undefined}
            })
                .success(function (data) {
                })
                .error(function (data) {

                });
        }
        else {
            $scope.fileIsEmpty = true;
        }
    }
}]);

app.controller('contactusController', function($scope) {
    $scope.headingTitle = "Contributors";
});
