package com.oneworld.springcloudfeign.api.controller;

import java.util.List;

import com.oneworld.springcloudfeign.api.client.UserClient;
import com.oneworld.springcloudfeign.api.dto.UserResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserClient userClient;

    @GetMapping("/findAllUsers")
    public List<UserResponse> getAllUsers() {

        LOGGER.info(" getAllUsers Method execution");
      return  userClient.getUsers();
    }

}
