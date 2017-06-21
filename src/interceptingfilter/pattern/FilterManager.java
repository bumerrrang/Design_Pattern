
package interceptingfilter.pattern;

/**
 * project name: Design_Pattern
 * package name: interceptingfilter.pattern
 * file name: FilterManager.java
 * project version: default
 * Created:
 * Jun 21, 2017, 11:26:42 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/intercepting_filter_pattern.htm
public class FilterManager {
   FilterChain filterChain;

   public FilterManager(Target target){
      filterChain = new FilterChain();
      filterChain.setTarget(target);
   }
   public void setFilter(Filter filter){
      filterChain.addFilter(filter);
   }

   public void filterRequest(String request){
      filterChain.execute(request);
   }
}