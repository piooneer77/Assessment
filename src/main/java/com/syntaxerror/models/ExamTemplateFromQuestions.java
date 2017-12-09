package com.syntaxerror.models;

import javax.persistence.*;

@Entity
@Table(name = "exam_question_table")
public class ExamTemplateFromQuestions {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Exam exam;
    @ManyToOne(fetch = FetchType.LAZY)
    private Question question;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public ExamTemplateFromQuestions() {
    }

    public ExamTemplateFromQuestions(Exam exam, Question question) {
        this.exam = exam;
        this.question = question;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public Exam getExam() {
        return exam;
    }

    public Question getQuestion() {
        return question;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
    // </editor-fold>

}
