package com.example.test.repository;

import com.example.test.entity.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonnelRepository extends JpaRepository<Personnel, String> {

    Personnel findPersonnelByUsername(String username);
}
