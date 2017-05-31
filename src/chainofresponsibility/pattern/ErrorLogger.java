
package chainofresponsibility.pattern;

/**
 * project name: Design_Pattern
 * package name: chainofresponsibility.pattern
 * file name: ErrorLogger.java
 * project version: default
 * Created:
 * May 31, 2017, 11:35:13 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm
public class ErrorLogger extends AbstractLogger {

   public ErrorLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Error Console::Logger: " + message);
   }
}