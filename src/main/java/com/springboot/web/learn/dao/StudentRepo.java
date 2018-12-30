package com.springboot.web.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.learn.model.Student;

@Repository
//@RepositoryRestResource(collectionResourceRel="student", path="student") by doing so no need of seperate controller class
//Select Rest Repository while project creation otherwise import wont work
//Better create a new project
public interface StudentRepo extends JpaRepository<Student, Integer> //CrudRepository
{

}
