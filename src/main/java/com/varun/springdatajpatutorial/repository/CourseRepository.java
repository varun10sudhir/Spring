package com.varun.springdatajpatutorial.repository;

import com.varun.springdatajpatutorial.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends JpaRepository<Course,Long>
{


}
