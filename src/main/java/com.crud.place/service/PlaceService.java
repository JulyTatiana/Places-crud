package com.crud.place.service;

import com.crud.crudplace.entity.Book;
import com.crud.crudplace.repository.BookRepository;
import com.crud.place.entity.Place;
import com.crud.place.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService implements com.crud.crudplace.service.BookServiceInterface {

    @Autowired
    private PlaceRepository bookRepository;

    @Override
    public List<Place> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Place saveBook(Place book) {
        return bookRepository.save(book);
    }

    @Override
    public Place updateBook(Place book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
