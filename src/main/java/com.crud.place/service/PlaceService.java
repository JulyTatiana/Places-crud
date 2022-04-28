package com.crud.place.service;

import com.crud.place.entity.Place;
import com.crud.place.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService implements PlaceServiceInterface {

    @Autowired
    private PlaceRepository placeRepository;

    @Override
    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }

    @Override
    public Place savePlace(Place place) {
        return placeRepository.save(place);
    }

    @Override
    public Place updatePlace(Place place) {
        return placeRepository.save(place);
    }

    @Override
    public void deletePlace(Long id) {
        placeRepository.deleteById(id);
    }
}
