
package filter.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * project name: Design_Pattern
 * package name: filter.pattern
 * file name: CriteriaFemale.java
 * project version: default
 * Created:
 * May 19, 2017, 11:37:38 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/filter_pattern.htm
public class CriteriaFemale implements Criteria {

   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> femalePersons = new ArrayList<Person>(); 
      
      for (Person person : persons) {
         if(person.getGender().equalsIgnoreCase("FEMALE")){
            femalePersons.add(person);
         }
      }
      return femalePersons;
   }
}