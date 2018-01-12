package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

	BookRepository bookRepository;
	
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@GetMapping("/all")
	public List<Book> getAllBooks() {
		List<Book> books = this.bookRepository.findAll();
		return books;
	}
	
    @PutMapping
    public void insert(@RequestBody Book hotel){
        this.bookRepository.insert(hotel);
    }

    @PostMapping
    public void update(@RequestBody Book hotel){
        this.bookRepository.save(hotel);
    }
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		this.bookRepository.delete(id);
	}
}
