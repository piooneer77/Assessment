package com.syntaxerror.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "question_table")
public class Question {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String questionString;
    private String modelAnswer;
    private Integer marks;
    private String subject;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
    private List<ExamTemplateFromQuestions> examTemplateFromQuestionss = new ArrayList<>();
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Question() {
    }

    public Question(String questionString, String modelAnswer, Integer marks, String subject) {
        this.questionString = questionString;
        this.modelAnswer = modelAnswer;
        this.marks = marks;
        this.subject = subject;
    }

    public Question(Integer Id, String questionString, String modelAnswer, Integer marks, String subject) {
        this.Id = Id;
        this.questionString = questionString;
        this.modelAnswer = modelAnswer;
        this.marks = marks;
        this.subject = subject;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public String getQuestionString() {
        return questionString;
    }

    public String getModelAnswer() {
        return modelAnswer;
    }

    public Integer getMarks() {
        return marks;
    }

    public String getSubject() {
        return subject;
    }

    public List<ExamTemplateFromQuestions> getExamTemplateFromQuestionss() {
        return examTemplateFromQuestionss;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setQuestionString(String questionString) {
        this.questionString = questionString;
    }

    public void setModelAnswer(String modelAnswer) {
        this.modelAnswer = modelAnswer;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setExamTemplateFromQuestionss(ExamTemplateFromQuestions examTemplateFromQuestions) {
        this.examTemplateFromQuestionss.add(examTemplateFromQuestions);
    }
    // </editor-fold>

}
