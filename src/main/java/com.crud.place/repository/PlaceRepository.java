package com.crud.place.repository;

import com.crud.crudplace.entity.Book;
import com.crud.place.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {
}