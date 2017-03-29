app.controller('CustomerController', function($scope,$http) {
	
	$scope.submitForm = function(formInValid){
		if(!formInValid){
			var customer = {
					 "name": $scope.name,
				     "age":$scope.age,
				     "address1":$scope.address1,
				     "address2":$scope.address2,
				     "locality":$scope.locality,
				     "landmark":$scope.landmark,
				     "city":$scope.city,
				     "state":$scope.state,
				     "mobileNumber":$scope.phone,
				     "alternateMobile":$scope.alternatePhone,
				     "emailId":$scope.email,
				     "referrerId":$scope.referrerId
				};
			saveCustomer(customer);
		}else{
			$scope.customerFormSuccess = true;
		}
	}  
		
	function saveCustomer(customer){
		
		var url = "/customers";
		postRequest(customer);
		
	}
	function postRequest(data){
		$http.post(url,customer)
	    .then(function(response) {
	        $scope.customerFormSuccess = true;
	        $scope.custId = response.data;
	    });
	}
});