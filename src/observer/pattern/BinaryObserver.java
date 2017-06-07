
package observer.pattern;

/**
 * project name: Design_Pattern
 * package name: observer.pattern
 * file name: BinaryObserver.java
 * project version: default
 * Created:
 * Jun 7, 2017, 9:40:00 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
public class BinaryObserver extends Observer{

   public BinaryObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
   }
}