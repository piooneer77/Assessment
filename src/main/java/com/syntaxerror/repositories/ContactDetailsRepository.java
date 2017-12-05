package com.syntaxerror.repositories;

import com.syntaxerror.models.ContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDetailsRepository extends JpaRepository <ContactDetails, Integer> {
    
}
