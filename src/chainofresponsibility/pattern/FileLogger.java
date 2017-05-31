
package chainofresponsibility.pattern;

/**
 * project name: Design_Pattern
 * package name: chainofresponsibility.pattern
 * file name: FileLogger.java
 * project version: default
 * Created:
 * May 31, 2017, 11:35:52 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm
public class FileLogger extends AbstractLogger {

   public FileLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("File::Logger: " + message);
   }
}