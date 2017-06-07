
package observer.pattern;

/**
 * project name: Design_Pattern
 * package name: observer.pattern
 * file name: Observer.java
 * project version: default
 * Created:
 * Jun 7, 2017, 9:39:06 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}