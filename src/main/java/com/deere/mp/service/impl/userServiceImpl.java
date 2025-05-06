package com.deere.mp.service.impl;

import com.deere.mp.enitities.userEntity;
import com.deere.mp.repository.userRepository;
import com.deere.mp.responseRequestBeans.userNameResBean;
import com.deere.mp.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class userServiceImpl implements userService {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int STRING_LENGTH = 4;
    public static final String idPrefix = "10";
    public static final String ADMIN = "10101AD";
    @Autowired
    private userRepository userRepository;
    @Override
    public List<userEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public String addNewDealer(userEntity newUser) {
        if(newUser.getAccountId().isEmpty() && !getNewAccountId().isEmpty()) {
            newUser.setAccountId(getNewAccountId());
            newUser.setAdmin(false);
            userRepository.save(newUser);
            return "Saved : Successfull !!";
        }
        else
            return "Existing User !!";
    }

    @Override
    public List<userEntity> getdealerBasedOnCountryCd(String code) {
        return userRepository.findByCountryCode(code);
    }

    @Override
    public List<userNameResBean> getUserNameAndMobile() {
        List<userEntity> users = getAllUsers();
        //users.forEach(userEntity -> {userNames.add(new userNameResBean(userEntity.getUserFirstName(),userEntity.getUserLastName(),userEntity.getMobileNo()));});
        return users.stream().map(userEntity -> new userNameResBean(userEntity.getUserFirstName(),userEntity.getUserLastName(),userEntity.getMobileNo())).collect(Collectors.toList());
    }

    private String getRandomId() {
        Random random = new Random();
        return random.ints(STRING_LENGTH, 0, CHARACTERS.length())
                .mapToObj(i -> String.valueOf(CHARACTERS.charAt(i)))
                .collect(Collectors.joining());
    }

    private String getNewAccountId(){
        String newId = idPrefix +getRandomId();
        userEntity existingUser = userRepository.findByAccountId(newId);
        if (existingUser == null && !newId.equals(ADMIN)) {
            return newId;
        }
        return "";
    }
}
