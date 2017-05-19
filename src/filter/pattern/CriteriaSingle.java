
package filter.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * project name: Design_Pattern
 * package name: filter.pattern
 * file name: CriteriaSingle.java
 * project version: default
 * Created:
 * May 19, 2017, 11:38:57 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/filter_pattern.htm
public class CriteriaSingle implements Criteria {

   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> singlePersons = new ArrayList<Person>(); 
      
      for (Person person : persons) {
         if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
            singlePersons.add(person);
         }
      }
      return singlePersons;
   }
}