
package chainofresponsibility.pattern;

/**
 * project name: Design_Pattern
 * package name: chainofresponsibility.pattern
 * file name: AbstractLogger.java
 * project version: default
 * Created:
 * May 31, 2017, 11:31:49 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm
public abstract class AbstractLogger {
   public static int INFO = 1;
   public static int DEBUG = 2;
   public static int ERROR = 3;

   protected int level;

   //next element in chain or responsibility
   protected AbstractLogger nextLogger;

   public void setNextLogger(AbstractLogger nextLogger){
      this.nextLogger = nextLogger;
   }

   public void logMessage(int level, String message){
      if(this.level <= level){
         write(message);
      }
      if(nextLogger != null){
         nextLogger.logMessage(level, message);
      }
   }

   abstract protected void write(String message);
	
}