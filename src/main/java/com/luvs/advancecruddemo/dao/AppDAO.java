package com.luvs.advancecruddemo.dao;

import com.luvs.advancecruddemo.entity.Course;
import com.luvs.advancecruddemo.entity.Instructor;
import com.luvs.advancecruddemo.entity.InstructorDetail;
import com.luvs.advancecruddemo.entity.Student;

import java.util.List;

public interface AppDAO {

    void save(Instructor theInstructor);
    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);

    List<Course> findCoursesByInstructorId(int theId);

    Instructor findInstructorByJoinFetch(int theId);

    void update(Instructor tempInstructor);
    void update(Course tempInstructor);



    Course findCourseById(int theId);

    void deleteCourseById(int theId);


    void save(Course theCourse);

    Course findCourseAndReviewsByCourseId(int theId);

    Course findCourseAndStudentsByCourseId(int theId);

    Student findStudentAndCoursesByStudentId(int theId);

    void update(Student tempStudent);

    void deleteStudentById(int theId);


}
