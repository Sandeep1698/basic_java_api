package com.deere.mp.responseRequestBeans;


import java.io.Serializable;

public class userNameResBean implements Serializable {
    private String fName;
    private String lName;
    private String mobileNo;

    public userNameResBean(String fName, String lName, String mobileNo) {
        this.fName = fName;
        this.lName = lName;
        this.mobileNo = mobileNo;
    }
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
