package com.ghm.guesthousemanagement.controller;


import com.ghm.guesthousemanagement.models.Property;
import com.ghm.guesthousemanagement.service.PropertyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class PropertyController {

    private PropertyService propertyService;

    @GetMapping()
    public ResponseEntity<List<Property>> getAllProperties(){
        List<Property> properties = propertyService.getAllProperties();
        return ResponseEntity.ok(properties);
    }

    @PostMapping()
    public ResponseEntity<Property> addProperty(@RequestBody Property property){
        Property savedProperty = propertyService.addProperty(property);
        return new ResponseEntity<>(savedProperty, HttpStatus.CREATED);
    }

}
