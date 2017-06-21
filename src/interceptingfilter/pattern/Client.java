
package interceptingfilter.pattern;

/**
 * project name: Design_Pattern
 * package name: interceptingfilter.pattern
 * file name: Client.java
 * project version: default
 * Created:
 * Jun 21, 2017, 11:27:13 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/intercepting_filter_pattern.htm
public class Client {
   FilterManager filterManager;

   public void setFilterManager(FilterManager filterManager){
      this.filterManager = filterManager;
   }

   public void sendRequest(String request){
      filterManager.filterRequest(request);
   }
}