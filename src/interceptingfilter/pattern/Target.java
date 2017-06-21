
package interceptingfilter.pattern;

/**
 * project name: Design_Pattern
 * package name: interceptingfilter.pattern
 * file name: Target.java
 * project version: default
 * Created:
 * Jun 21, 2017, 11:24:56 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/intercepting_filter_pattern.htm
public class Target {
   public void execute(String request){
      System.out.println("Executing request: " + request);
   }
}