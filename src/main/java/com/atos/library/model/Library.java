package com.atos.library.model;import com.atos.library.engines.DistributionEngine;import com.atos.library.engines.SearchEngine;import com.atos.library.engines.SearchInfoEngine;import java.util.ArrayList;import java.util.List;public class Library {    private List<Book> books;    private DistributionEngine distributionEngine;    private SearchInfoEngine searchInfoEngine;    private SearchEngine searchEngine;    public Library(DistributionEngine distributionEngine, SearchInfoEngine searchInfoEngine,                   SearchEngine searchEngine) {        this.distributionEngine = distributionEngine;        this.searchInfoEngine = searchInfoEngine;        this.searchEngine = searchEngine;        this.books = new ArrayList<>();    }    public void addBook(Book book) {        distributionEngine.addBook(books, book);    }    public void checkBookById(int id) {        searchInfoEngine.printBookSearchResult(searchEngine.findBookById(books, id));    }    public void checkLibraryStatus() {        searchInfoEngine.printLibraryStatus(books);    }    public void checkBooksByAuthor(String author) {        searchInfoEngine.printBooksSearchResults(searchEngine.findBooksByAuthor(books, author));    }    public void checkBooksByAuthorAndTitle(String author, String title) {        searchInfoEngine.printBooksSearchResults(searchEngine.findBooksByAuthorAndTitle(books, author, title));    }    public void checkBooksByAuthorAndYear(String author, int year) {        searchInfoEngine.printBooksSearchResults(searchEngine.findBooksByAuthorAndYear(books, author, year));    }    public void checkBooksByTitle(String title) {        searchInfoEngine.printBooksSearchResults(searchEngine.findBooksByTitle(books, title));    }    public void checkBooksByYear(int year) {        searchInfoEngine.printBooksSearchResults(searchEngine.findBooksByYear(books, year));    }    public void checkBooksByYearAndTitle(int year, String title) {        searchInfoEngine.printBooksSearchResults(searchEngine.findBooksByYearAndTitle(books, year, title));    }    public void lendBook(int id, String reader) {        distributionEngine.lendBook(books, id, reader);    }    public void removeBook(int id) {        distributionEngine.removeBook(books, id);    }}