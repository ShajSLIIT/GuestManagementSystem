package com.ghm.guesthousemanagement.controller;


import com.ghm.guesthousemanagement.models.Room;
import com.ghm.guesthousemanagement.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/rooms")
public class RoomController {

    private RoomService roomService;

    @PostMapping
    public ResponseEntity<Room> addRoom(Room room){
        Room savedRoom = roomService.addRoom(room);
        return new ResponseEntity<>(savedRoom,HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Room>> getAllRooms(){
        List<Room> rooms = roomService.getAllRooms();
        return ResponseEntity.ok(rooms);
    }
}
