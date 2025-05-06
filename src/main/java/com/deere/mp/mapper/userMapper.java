package com.deere.mp.mapper;

import com.deere.mp.enitities.userEntity;
import com.deere.mp.responseRequestBeans.responseUserBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class userMapper {
    public responseUserBean mapUserBean(List<userEntity> users,String msg){
        responseUserBean userBean = new responseUserBean();
        userBean.setUsers(new ArrayList<>(users));
        userBean.setMessage(msg);
        return userBean;
    }
}
