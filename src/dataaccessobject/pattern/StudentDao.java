
package dataaccessobject.pattern;

import java.util.List;

/**
 * project name: Design_Pattern
 * package name: dataaccessobject.pattern
 * file name: StudentDao.java
 * project version: default
 * Created:
 * Jun 19, 2017, 11:21:41 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm
public interface StudentDao {
   public List<Student> getAllStudents();
   public Student getStudent(int rollNo);
   public void updateStudent(Student student);
   public void deleteStudent(Student student);
}