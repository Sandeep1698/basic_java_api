package com.deere.mp.controller;

import com.deere.mp.enitities.userEntity;
import com.deere.mp.mapper.userMapper;
import com.deere.mp.responseRequestBeans.userNameResBean;
import com.deere.mp.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(value = "/deere")
@EnableWebMvc
public class userController {

    @Autowired
    private userService service;

    @Autowired
    private userMapper mapper;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public ResponseEntity<List<userEntity>> getAllUser(){
        List<userEntity> users = service.getAllUsers();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(users, headers, OK);
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addNewUser(@RequestBody userEntity newUser){
       return service.addNewDealer(newUser);
    }

    @RequestMapping(value = "/filerUser",method = RequestMethod.GET)
    public ResponseEntity<List<userEntity>> getUsersBasedOnCountryCode(@RequestParam("countryCode") String code){
        List<userEntity> users = service.getdealerBasedOnCountryCd(code);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(users, headers, OK);
    }

    @RequestMapping(value = "/getAllDealerName",method = RequestMethod.GET)
    public ResponseEntity<List<userNameResBean>> getUserName(){
        List<userNameResBean> users = service.getUserNameAndMobile();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(users, headers, OK);
    }
}
