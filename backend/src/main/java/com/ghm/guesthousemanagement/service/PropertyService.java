package com.ghm.guesthousemanagement.service;

import com.ghm.guesthousemanagement.models.Property;

import java.util.List;

public interface PropertyService {

    public List<Property> getAllProperties();
    public Property addProperty(Property property);

}
