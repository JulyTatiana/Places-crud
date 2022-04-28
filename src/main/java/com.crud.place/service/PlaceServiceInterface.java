package com.crud.place.service;

import com.crud.place.entity.Place;

import java.util.List;

public interface PlaceServiceInterface {

    List<Place> getAllPlaces();

    Place savePlace(Place book);

    Place updatePlace(Place place);

    void deletePlace(Long id);
}