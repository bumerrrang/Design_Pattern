
package chainofresponsibility.pattern;

/**
 * project name: Design_Pattern
 * package name: chainofresponsibility.pattern
 * file name: ConsoleLogger.java
 * project version: default
 * Created:
 * May 31, 2017, 11:34:30 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm
public class ConsoleLogger extends AbstractLogger {

   public ConsoleLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Standard Console::Logger: " + message);
   }
}