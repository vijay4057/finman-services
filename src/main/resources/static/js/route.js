app.config(function($routeProvider) {
    $routeProvider
    .when("/customer", {
        templateUrl : "/customer/customer.html",
        controller : "CustomerController"
    });
});
