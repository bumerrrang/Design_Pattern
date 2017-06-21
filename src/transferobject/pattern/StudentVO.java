
package transferobject.pattern;

/**
 * project name: Design_Pattern
 * package name: transferobject.pattern
 * file name: StudentVO.java
 * project version: default
 * Created:
 * Jun 21, 2017, 11:44:00 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/transfer_object_pattern.htm
public class StudentVO {
   private String name;
   private int rollNo;

   StudentVO(String name, int rollNo){
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