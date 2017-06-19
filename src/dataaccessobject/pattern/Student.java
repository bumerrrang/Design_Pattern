
package dataaccessobject.pattern;

/**
 * project name: Design_Pattern
 * package name: dataaccessobject.pattern
 * file name: Student.java
 * project version: default
 * Created:
 * Jun 19, 2017, 11:20:55 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm
public class Student {
   private String name;
   private int rollNo;

   Student(String name, int rollNo){
      this.name = name;
      this.rollNo = rollNo;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getRollNo() {
      return rollNo;
   }

   public void setRollNo(int rollNo) {
      this.rollNo = rollNo;
   }
}