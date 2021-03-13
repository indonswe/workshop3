package Data;


import models.Student;

import java.util.Collection;

public interface StudentDAO extends QueryStudent{
    Student create(Student student);
    Student findById(Integer studentId);
    Collection<Student> findAll();
    Student update(Student student);
    boolean delete(Integer studentId);
}
