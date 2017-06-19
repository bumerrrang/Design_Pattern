
package dataaccessobject.pattern;

/**
 * project name: Design_Pattern
 * package name: dataaccessobject.pattern
 * file name: DaoPatternDemo.java
 * project version: default
 * Created:
 * Jun 19, 2017, 11:23:42 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm
public class DaoPatternDemo {
   public static void main(String[] args) {
      StudentDao studentDao = new StudentDaoImpl();

      //print all students
      for (Student student : studentDao.getAllStudents()) {
         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
      }


      //update student
      Student student =studentDao.getAllStudents().get(0);
      student.setName("Michael");
      studentDao.updateStudent(student);

      //get the student
      studentDao.getStudent(0);
      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");		
   }
}