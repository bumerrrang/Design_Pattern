
package observer.pattern;

/**
 * project name: Design_Pattern
 * package name: observer.pattern
 * file name: ObserverPatternDemo.java
 * project version: default
 * Created:
 * Jun 7, 2017, 9:42:52 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      new HexalObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);

      System.out.println("First state change: 15");	
      subject.setState(15);
      System.out.println("Second state change: 10");	
      subject.setState(10);
   }
}