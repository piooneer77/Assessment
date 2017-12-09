package com.syntaxerror.models;

import javax.persistence.*;

@Entity
@Table(name = "contact_details_table")
public class ContactDetails {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer accountId;
    private String email;
    private String address;
    private String phone;
    private String mobile;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public ContactDetails() {
    }

    public ContactDetails(String email, String address, String phone, String mobile) {
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.mobile = mobile;
    }

    public ContactDetails(Integer accountId, String email, String address, String phone, String mobile) {
        this.accountId = accountId;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.mobile = mobile;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getAccountId() {
        return accountId;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    // </editor-fold>

}
