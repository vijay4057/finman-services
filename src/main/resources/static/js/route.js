app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "/",
    })
    .when("/customer", {
        templateUrl : "/customer/customer.html",
        controller : "CustomerController"
    });
});
