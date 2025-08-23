package com.ghm.guesthousemanagement.repository;

import com.ghm.guesthousemanagement.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Room, Long> {
}
