package com.syntaxerror.models;

import javax.persistence.*;

@Entity
@Table(name = "exam_question_table")
public class ExamTemplateFromQuestions {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private Integer examId;
    private Integer questionId;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public ExamTemplateFromQuestions() {
    }

    public ExamTemplateFromQuestions(Integer examId, Integer questionId) {
        this.examId = examId;
        this.questionId = questionId;
    }

    public ExamTemplateFromQuestions(Integer Id, Integer examId, Integer questionId) {
        this.Id = Id;
        this.examId = examId;
        this.questionId = questionId;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public Integer getExamId() {
        return examId;
    }

    public Integer getQuestionId() {
        return questionId;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
    // </editor-fold>

}
