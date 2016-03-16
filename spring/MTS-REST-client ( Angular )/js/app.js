/**
 * http://usejsdoc.org/
 */

var mts = angular.module('mts', []);
mts.controller('TxrController', function($scope, $http) {
	var txrForm = {};
	$scope.doTxr = function() {
		var url = "http://localhost:8080/mts/txr";
		$http.post(url, txrForm).then(function(result) {
			$scope.staus = result.data.message;
			var txrForm = {};
		});
	};

});