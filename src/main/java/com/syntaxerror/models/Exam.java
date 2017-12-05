package com.syntaxerror.models;

import javax.persistence.*;

@Entity
@Table(name = "exam_table")
public class Exam {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String name;
    private String subject;
    private String dificultyLevel;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">

    // </editor-fold>

}
