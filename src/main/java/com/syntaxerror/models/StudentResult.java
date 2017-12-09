package com.syntaxerror.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "student_result_table")
public class StudentResult {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;
    @ManyToOne(fetch = FetchType.LAZY)
    private Exam exam;
    private Integer marks;
    private LocalDate date;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public StudentResult() {
    }

    public StudentResult(Student student, Exam exam, Integer marks, LocalDate date) {
        this.student = student;
        this.exam = exam;
        this.marks = marks;
        this.date = date;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public Student getStudent() {
        return student;
    }

    public Exam getExam() {
        return exam;
    }

    public Integer getMarks() {
        return marks;
    }

    public LocalDate getDate() {
        return date;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setStudent(Student student) {
        this.student = student;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    // </editor-fold>

}
