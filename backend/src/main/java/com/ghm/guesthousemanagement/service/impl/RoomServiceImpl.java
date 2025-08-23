package com.ghm.guesthousemanagement.service.impl;

import com.ghm.guesthousemanagement.models.Room;
import com.ghm.guesthousemanagement.repository.RoomRepo;
import com.ghm.guesthousemanagement.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoomServiceImpl implements RoomService {

    private RoomRepo roomRepo;


    @Override
    public List<Room> getAllRooms() {
        return roomRepo.findAll();
    }

    @Override
    public Room addRoom(Room room) {
        return roomRepo.save(room);
    }

}
