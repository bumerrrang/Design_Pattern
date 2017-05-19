
package filter.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * project name: Design_Pattern
 * package name: filter.pattern
 * file name: CriteriaMale.java
 * project version: default
 * Created:
 * May 19, 2017, 11:36:35 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/filter_pattern.htm
public class CriteriaMale implements Criteria {

   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> malePersons = new ArrayList<Person>(); 
      
      for (Person person : persons) {
         if(person.getGender().equalsIgnoreCase("MALE")){
            malePersons.add(person);
         }
      }
      return malePersons;
   }
}