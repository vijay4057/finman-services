app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "index.html"
    })
    .when("/customer", {
        templateUrl : "/customer/customer.html"
    });
});