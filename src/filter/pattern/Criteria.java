
package filter.pattern;

import java.util.List;

/**
 * project name: Design_Pattern
 * package name: filter.pattern
 * file name: Criteria.java
 * project version: default
 * Created:
 * May 19, 2017, 11:35:44 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/filter_pattern.htm
public interface Criteria {
   public List<Person> meetCriteria(List<Person> persons);
}