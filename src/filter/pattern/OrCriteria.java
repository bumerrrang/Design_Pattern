
package filter.pattern;

import java.util.List;

/**
 * project name: Design_Pattern
 * package name: filter.pattern
 * file name: OrCriteria.java
 * project version: default
 * Created:
 * May 19, 2017, 11:40:40 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/filter_pattern.htm
public class OrCriteria implements Criteria {

   private Criteria criteria;
   private Criteria otherCriteria;

   public OrCriteria(Criteria criteria, Criteria otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }

   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
      List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

      for (Person person : otherCriteriaItems) {
         if(!firstCriteriaItems.contains(person)){
            firstCriteriaItems.add(person);
         }
      }	
      return firstCriteriaItems;
   }
}