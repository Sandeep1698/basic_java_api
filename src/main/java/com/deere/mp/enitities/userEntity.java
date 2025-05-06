package com.deere.mp.enitities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Table(name = "user")
@Entity
@AllArgsConstructor
public class userEntity {

    @Id
    private String accountId;
    private String userFirstName;
    private String userLastName;
    private String mobileNo;
    private String email;
    private String branchCode;
    @ColumnDefault("False")
    private boolean admin;
    private String countryCode;
    private String country;
    private String currency;

    public userEntity() {
    }

    public String getAccountId() {
        return accountId;
    }
    public userEntity(String userFirstName, String userLastName, String mobileNo) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.mobileNo = mobileNo;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
