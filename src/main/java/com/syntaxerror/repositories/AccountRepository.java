package com.syntaxerror.repositories;

import com.syntaxerror.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
