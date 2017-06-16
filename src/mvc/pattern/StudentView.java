
package mvc.pattern;

/**
 * project name: Design_Pattern
 * package name: mvc.pattern
 * file name: StudentView.java
 * project version: default
 * Created:
 * Jun 16, 2017, 10:36:54 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm
public class StudentView {
   public void printStudentDetails(String studentName, String studentRollNo){
      System.out.println("Student: ");
      System.out.println("Name: " + studentName);
      System.out.println("Roll No: " + studentRollNo);
   }
}