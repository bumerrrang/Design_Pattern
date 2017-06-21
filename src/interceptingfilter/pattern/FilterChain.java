
package interceptingfilter.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * project name: Design_Pattern
 * package name: interceptingfilter.pattern
 * file name: FilterChain.java
 * project version: default
 * Created:
 * Jun 21, 2017, 11:25:40 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/intercepting_filter_pattern.htm
public class FilterChain {
   private List<Filter> filters = new ArrayList<Filter>();
   private Target target;

   public void addFilter(Filter filter){
      filters.add(filter);
   }

   public void execute(String request){
      for (Filter filter : filters) {
         filter.execute(request);
      }
      target.execute(request);
   }

   public void setTarget(Target target){
      this.target = target;
   }
}