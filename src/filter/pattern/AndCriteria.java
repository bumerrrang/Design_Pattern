
package filter.pattern;

import java.util.List;

/**
 * project name: Design_Pattern
 * package name: filter.pattern
 * file name: AndCriteria.java
 * project version: default
 * Created:
 * May 19, 2017, 11:39:50 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/filter_pattern.htm
public class AndCriteria implements Criteria {

   private Criteria criteria;
   private Criteria otherCriteria;

   public AndCriteria(Criteria criteria, Criteria otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }

   @Override
   public List<Person> meetCriteria(List<Person> persons) {
   
      List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);		
      return otherCriteria.meetCriteria(firstCriteriaPersons);
   }
}