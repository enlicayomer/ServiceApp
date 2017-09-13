var storeApp=angular.module('storeApp',['ngRoute','ngResource','nya.bootstrap.select']);
storeApp.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/books', {
		templateUrl : 'partials/book-list.html',
		controller : 'BookController',
		controllerAs : 'bc'
	}).when('/books/:bookId', {
		templateUrl : 'partials/book-detail.html',
		controller : 'BookDetailCtrl',
		controllerAs : 'bdc'
	}).when('/addbook', {
		templateUrl : 'partials/add-book.html',
		controller : 'NewBookController',
		controllerAs : 'nbc'
	}).when('/authors', {
		templateUrl : 'partials/authors.html',
		controller : 'AuthorController',
		controllerAs : 'ac'
	}).otherwise({
		redirectTo : '/books'
	});
} ]);

storeApp.factory('BookService', function($resource) {
	return $resource('/api/books/:id');
});
storeApp.factory('CategoryService', function($resource) {
	return $resource('/api/categories/:id');
});
storeApp.factory('PublisherService', function($resource) {
	return $resource('/api/publishers/:id');
});
storeApp.factory('AuthorService', function($resource) {
	return $resource('/api/authors/:id');
});
storeApp.factory('CommentService', function($resource) {
	return $resource('/api/books/:bookid/comments/:id');
});

