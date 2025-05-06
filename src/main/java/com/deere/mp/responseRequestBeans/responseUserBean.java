package com.deere.mp.responseRequestBeans;

import com.deere.mp.enitities.userEntity;
import java.util.List;

public class responseUserBean {
    private List<userEntity> users;

    private String message;

    public void setUsers(List<userEntity> users) {
        this.users = users;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
