package com.crud.place.controller;

import com.crud.place.entity.Place;
import com.crud.place.service.PlaceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class PlaceController {

    @Autowired
    private PlaceServiceInterface service;

    @GetMapping("get/places")
    public List<Place> getAllPlaces(){
        return service.getAllPlaces();
    }

    @PostMapping("save/book")
    public Place savePlace(@RequestBody Place place){
        return service.savePlace(place);
    }

    @PutMapping("update/place")
    public Place updateBook(@RequestBody Place place){
        return service.updatePlace(place);
    }

    @DeleteMapping("delete/place/{id}")
    public void deletePlace(@PathVariable Long id){
        service.deletePlace(id);
    }

}