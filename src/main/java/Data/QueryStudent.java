package Data;



import models.Student;

import java.util.Collection;

public interface QueryStudent {
    Collection<Student> findByStudentLastName(String fullName);
}
