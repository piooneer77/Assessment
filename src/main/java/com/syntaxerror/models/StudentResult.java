package com.syntaxerror.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "student_result_table")
public class StudentResult {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    private Integer accountId;
    private Integer examId;
    private Integer marks;
    private LocalDate date;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public StudentResult() {
    }

    public StudentResult(Integer accountId, Integer examId, Integer marks, LocalDate date) {
        this.accountId = accountId;
        this.examId = examId;
        this.marks = marks;
        this.date = date;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getAccountId() {
        return accountId;
    }

    public Integer getExamId() {
        return examId;
    }

    public Integer getMarks() {
        return marks;
    }

    public LocalDate getDate() {
        return date;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    // </editor-fold>

}
