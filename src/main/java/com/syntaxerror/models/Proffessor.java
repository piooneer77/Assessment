package com.syntaxerror.models;

import javax.persistence.*;

public class Proffessor extends Account{

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @OneToOne
    private ContactDetails contactDetails;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Proffessor(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Proffessor(String firstName, String lastName, String user, String magic, Boolean isAdmin, Boolean isLocked, Boolean isActive, ContactDetails contactDetails) {
        super(firstName, lastName, user, magic, isAdmin, isLocked, isActive);
        this.contactDetails = contactDetails;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public ContactDetails getContactDetails() {
        return contactDetails;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }
    // </editor-fold>

}
