package com.deere.mp.service;

import com.deere.mp.enitities.userEntity;
import com.deere.mp.responseRequestBeans.userNameResBean;

import java.util.List;


public interface userService {
    public List<userEntity> getAllUsers();
    public String addNewDealer(userEntity newUser);
    public List<userEntity> getdealerBasedOnCountryCd(String code);
    public List<userNameResBean> getUserNameAndMobile();
}
