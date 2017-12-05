package com.syntaxerror.repositories;

import com.syntaxerror.models.ExamTemplateFromQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamTemplateFromQuestionsRepository extends JpaRepository<ExamTemplateFromQuestions, Integer>{

}
