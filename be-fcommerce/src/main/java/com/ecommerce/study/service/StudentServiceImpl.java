package com.ecommerce.study.service;


import java.util.List;

import com.ecommerce.study.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ecommerce.study.mapper.StudentMapper;

@Service(value = "studentService")

public class StudentServiceImpl implements  StudentService{

    @Autowired
    StudentMapper studentMapper;

    @Override
    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return 0;
    }

    @Override
    public int deleteStudentById(int studentId) {
        return 0;
    }

    @Override
    public List<Student> selectAllStudent() {
        return null;
    }

    @Override
    public Student selectStudentById(int studentId) {
        return null;
    }
}
