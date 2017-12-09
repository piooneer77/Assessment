package com.syntaxerror.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "exam")
    private List<ExamTemplateFromQuestions> examTemplateFromQuestionss = new ArrayList<>();
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Exam() {
    }

    public Exam(String name, String subject, String dificultyLevel) {
        this.name = name;
        this.subject = subject;
        this.dificultyLevel = dificultyLevel;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getDificultyLevel() {
        return dificultyLevel;
    }

    public List<ExamTemplateFromQuestions> getExamTemplateFromQuestionss() {
        return examTemplateFromQuestionss;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDificultyLevel(String dificultyLevel) {
        this.dificultyLevel = dificultyLevel;
    }

    public void setExamTemplateFromQuestionss(ExamTemplateFromQuestions examTemplateFromQuestions) {
        this.examTemplateFromQuestionss.add(examTemplateFromQuestions);
    }
    // </editor-fold>

}
