package com.ghm.guesthousemanagement.repository;

import com.ghm.guesthousemanagement.models.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepo extends JpaRepository<Property, Long> {

}
