package com.syntaxerror.repositories;

import com.syntaxerror.models.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, Integer>{

}
