package com.example.uploadfilenew.repository;

import com.example.uploadfilenew.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {
}