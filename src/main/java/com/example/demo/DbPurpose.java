package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbPurpose implements CommandLineRunner{

	BookRepository bookRepository;
	
	public DbPurpose(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public void run(String... arg0) throws Exception {
		Book hp = new Book(
				"Harry Potter",
				"J.K.Rowling",
				20,
				"Scholastic Corporation");
		
		Book mor = new Book(
				"Murder on Orient Express",
				"Agatha Cristie",
				20,
				"Crime Club Corporation");
		
		Book lor = new Book(
				"Lord of the Rings",
				"J.R.R.Tolkien",
				25,
				"Allen & Unwin");
		

		//drop all tables while the program is started again
		this.bookRepository.deleteAll();
		
		//add all table while started to the Database
		List<Book> books = Arrays.asList(hp, mor, lor);
		this.bookRepository.save(books);
	}
}
