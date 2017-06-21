
package interceptingfilter.pattern;

/**
 * project name: Design_Pattern
 * package name: interceptingfilter.pattern
 * file name: DebugFilter.java
 * project version: default
 * Created:
 * Jun 21, 2017, 11:24:14 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/intercepting_filter_pattern.htm
public class DebugFilter implements Filter {
   @Override
   public void execute(String request){
      System.out.println("request log: " + request);
   }
}