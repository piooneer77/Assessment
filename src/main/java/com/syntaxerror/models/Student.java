package com.syntaxerror.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Student_Table")
public class Student extends Account{

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "student")
    private List<StudentResult> studentResults = new ArrayList<StudentResult>();
    @OneToOne
    private ContactDetails contactDetails;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Student(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Student(String firstName, String lastName, String user, String magic, Boolean isAdmin, Boolean isLocked, Boolean isActive, List<StudentResult> studentResults, ContactDetails contactDetails) {
        super(firstName, lastName, user, magic, isAdmin, isLocked, isActive);
        this.studentResults = studentResults;
        this.contactDetails = contactDetails;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public List<StudentResult> getStudentResults() {
        return studentResults;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setStudentResults(StudentResult studentResult) {
        this.studentResults.add(studentResult);
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }
    // </editor-fold>

}
