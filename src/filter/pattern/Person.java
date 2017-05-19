
package filter.pattern;

/**
 * project name: Design_Pattern
 * package name: filter.pattern
 * file name: Person.java
 * project version: default
 * Created:
 * May 19, 2017, 11:34:46 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/filter_pattern.htm
public class Person {
	
   private String name;
   private String gender;
   private String maritalStatus;

   public Person(String name, String gender, String maritalStatus){
      this.name = name;
      this.gender = gender;
      this.maritalStatus = maritalStatus;		
   }

   public String getName() {
      return name;
   }
   public String getGender() {
      return gender;
   }
   public String getMaritalStatus() {
      return maritalStatus;
   }	
}