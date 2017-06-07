
package observer.pattern;

/**
 * project name: Design_Pattern
 * package name: observer.pattern
 * file name: OctalObserver.java
 * project version: default
 * Created:
 * Jun 7, 2017, 9:41:03 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
public class OctalObserver extends Observer{

   public OctalObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
   }
}