package com.thapa.jwt.controller;

import com.thapa.jwt.entity.UserDetails;
import com.thapa.jwt.service.UserService;
import com.thapa.jwt.utility.TokenHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping(value = "/signup")
    public void insert(@RequestBody UserDetails userDetails) {
        userService.insert(userDetails);
    }

    @GetMapping(value = "/login/{firstname}/{password}")
    public String search(@PathVariable("firstname") String firstname, @PathVariable("password") String password) {

        userService.search(firstname, password);
        while (userService.search(firstname, password)) {
            return TokenHandler.jwtCreater();
        }
        return "Incorrect";
    }

    @GetMapping(value = "/viewall")
    public ResponseEntity<List<UserDetails>> getAll() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }
}
