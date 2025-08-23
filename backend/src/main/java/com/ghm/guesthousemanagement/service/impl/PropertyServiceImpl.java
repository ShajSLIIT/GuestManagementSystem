package com.ghm.guesthousemanagement.service.impl;


import com.ghm.guesthousemanagement.models.Property;
import com.ghm.guesthousemanagement.repository.PropertyRepo;
import com.ghm.guesthousemanagement.service.PropertyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PropertyServiceImpl implements PropertyService {

    private PropertyRepo propertyRepo;

    @Override
    public List<Property> getAllProperties() {
        return propertyRepo.findAll();
    }

    @Override
    public Property addProperty(Property property) {
        return propertyRepo.save(property);
    }
}
