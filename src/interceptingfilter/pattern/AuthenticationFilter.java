
package interceptingfilter.pattern;

/**
 * project name: Design_Pattern
 * package name: interceptingfilter.pattern
 * file name: AuthenticationFilter.java
 * project version: default
 * Created:
 * Jun 21, 2017, 11:23:25 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/intercepting_filter_pattern.htm
public class AuthenticationFilter implements Filter {
   public void execute(String request){
      System.out.println("Authenticating request: " + request);
   }
}