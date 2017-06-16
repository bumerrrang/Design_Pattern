
package mvc.pattern;

/**
 * project name: Design_Pattern
 * package name: mvc.pattern
 * file name: Student.java
 * project version: default
 * Created:
 * Jun 16, 2017, 10:36:09 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm
public class Student {
   private String rollNo;
   private String name;
   
   public String getRollNo() {
      return rollNo;
   }
   
   public void setRollNo(String rollNo) {
      this.rollNo = rollNo;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
}