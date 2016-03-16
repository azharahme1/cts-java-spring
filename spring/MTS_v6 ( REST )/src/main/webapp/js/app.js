/**
 * http://usejsdoc.org/
 */

var mts = angular.module('mts', []);
mts.controller('TxrController', function($scope, $http) {
	$scope.txrForm = {};
	$scope.doTxr = function() {
		var url = "txr";
		$http.post(url, $scope.txrForm).then(function(result) {
			$scope.status = result.data.message;
			$scope.txrForm = {};
		});
	};

});