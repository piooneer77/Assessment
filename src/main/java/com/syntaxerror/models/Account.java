package com.syntaxerror.models;

import javax.persistence.*;

@Entity
@Table( name = "account_table" )
public class Account {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String firstName;
    private String lastName;
    private String user;
    private String magic;
    private Boolean isAdmin;
    private Boolean isLocked;
    private Boolean isActive;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Account() {
    }

    public Account(String firstName, String lastName, String user, String magic, Boolean isAdmin, Boolean isLocked, Boolean isActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.user = user;
        this.magic = magic;
        this.isAdmin = isAdmin;
        this.isLocked = isLocked;
        this.isActive = isActive;
    }

    public Account(Integer Id, String firstName, String lastName, String user, String magic, Boolean isAdmin, Boolean isLocked, Boolean isActive) {
        this.Id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.user = user;
        this.magic = magic;
        this.isAdmin = isAdmin;
        this.isLocked = isLocked;
        this.isActive = isActive;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUser() {
        return user;
    }

    public String getMagic() {
        return magic;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public Boolean getActive() {
        return isActive;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
    // </editor-fold>
}
