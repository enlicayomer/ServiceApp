storeApp.controller('BookController', function(BookService, $http) {
	var vm = this;
//	BookService.query(function(books) {
//		vm.books = books;
//	});
	
	$http.get('/api/books?orderby=publishdate').success(function(data) {
		   vm.books = data;
		});
});
storeApp.controller('BookDetailCtrl', function($routeParams,BookService) {
	var vm = this;
    BookService.get({
		id : $routeParams.bookId
	}, function(data) {
		vm.book = data;
	});
});

storeApp.controller('AuthorController', function(AuthorService, $http) {
	var vm = this;
	AuthorService.query(function(data) {
		vm.authors = data;
	});
});

storeApp.controller('NewBookController', function(BookService, CategoryService, AuthorService,PublisherService,$location) {
	var vm = this;	
	vm.book = {};
	
	CategoryService.query(function(categories) {
		vm.categories = categories;
	});
	PublisherService.query(function(publishers) {
		vm.publishers = publishers;
	});
	AuthorService.query(function(authors) {
		vm.authors = authors;
	});
	vm.addBook = function() {
		BookService.save({},vm.book);
		vm.book = {};
		$location.path("/books");
	};
});

storeApp.controller('PanelController', function() {
	var vm = this;
	vm.tab=1;
	vm.selectTab = function(setTab) {
		vm.tab = setTab;
	};
	this.isSelected = function(checkTab) {
		return vm.tab === checkTab;
	};
});

storeApp.controller("CommentController", function($routeParams, CommentService) {
	var vm = this;
	vm.comment = {}
	
	vm.addComment = function(book) {
		book.comments.push(vm.comment);
		CommentService.save({
			bookid : book.id
		}, vm.comment);
		vm.comment = {};
	};
});