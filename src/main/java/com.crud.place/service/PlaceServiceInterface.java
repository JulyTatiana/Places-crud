package com.crud.place.service;

import com.crud.crudplace.entity.Book;
import com.crud.place.entity.Place;

import java.util.List;

public interface PlaceServiceInterface {

    List<Place> getAllBooks();

    Place saveBook(Place book);

    Place updateBook(Place book);

    Place saveBook(Place book);

    void deleteBook(Long id);
}