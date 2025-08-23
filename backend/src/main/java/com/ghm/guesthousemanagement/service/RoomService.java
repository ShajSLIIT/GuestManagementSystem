package com.ghm.guesthousemanagement.service;

import com.ghm.guesthousemanagement.models.Room;

import java.util.List;

public interface RoomService {

    public List<Room> getAllRooms();
    public Room addRoom(Room room);

}
