app.controller('CustomerController', function($scope) {
	$scope.customerName = "Customer Name is John";
	
	$scope.submitForm = function(formValid){
		alert(formValid);
	}  
		
	
});