package com.varun.springdatajpatutorial.repository;


import com.varun.springdatajpatutorial.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Meta;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>
{
   List<Student>findByFirstName(String firstName);
   List<Student>findByFirstNameContaining(String firstName);


   @Modifying
   @Transactional
   @Query(
           value = "update tbl_student set first_name =?1 where email_address = ?2",
           nativeQuery=true
   )

   int updateStudentNameByEmailId(String firstName,String emailId );
}
