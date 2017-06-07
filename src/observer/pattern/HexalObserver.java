
package observer.pattern;

/**
 * project name: Design_Pattern
 * package name: observer.pattern
 * file name: HexalObserver.java
 * project version: default
 * Created:
 * Jun 7, 2017, 9:41:41 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
public class HexalObserver extends Observer{

   public HexalObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
}