package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.dto.ResponseDto;
import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<User>saveUser(@RequestBody User user){
        User savedUser=userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<ResponseDto> getUser(@PathVariable("id")Long id){
        ResponseDto responseDto=userService.getUser(id);
        return ResponseEntity.ok(responseDto);
    }
}
