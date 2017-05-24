
package composite.pattern;

/**
 * project name: Design_Pattern
 * package name: composite.pattern
 * file name: Employee.java
 * project version: default
 * Created:
 * May 24, 2017, 11:42:07 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/composite_pattern.htm
import java.util.ArrayList;
import java.util.List;

public class Employee {
   private String name;
   private String dept;
   private int salary;
   private List<Employee> subordinates;

   // constructor
   public Employee(String name,String dept, int sal) {
      this.name = name;
      this.dept = dept;
      this.salary = sal;
      subordinates = new ArrayList<Employee>();
   }

   public void add(Employee e) {
      subordinates.add(e);
   }

   public void remove(Employee e) {
      subordinates.remove(e);
   }

   public List<Employee> getSubordinates(){
     return subordinates;
   }

   public String toString(){
      return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
   }   
}