
package transferobject.pattern;

/**
 * project name: Design_Pattern
 * package name: transferobject.pattern
 * file name: TransferObjectPatternDemo.java
 * project version: default
 * Created:
 * Jun 21, 2017, 11:45:56 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/transfer_object_pattern.htm
public class TransferObjectPatternDemo {
   public static void main(String[] args) {
      StudentBO studentBusinessObject = new StudentBO();

      //print all students
      for (StudentVO student : studentBusinessObject.getAllStudents()) {
         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
      }

      //update student
      StudentVO student = studentBusinessObject.getAllStudents().get(0);
      student.setName("Michael");
      studentBusinessObject.updateStudent(student);

      //get the student
      student = studentBusinessObject.getStudent(0);
      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
   }
}