
package memento.pattern;

/**
 * project name: Design_Pattern
 * package name: memento.pattern
 * file name: MementoPatternDemo.java
 * project version: default
 * Created:
 * Jun 7, 2017, 9:31:53 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/memento_pattern.htm
public class MementoPatternDemo {
   public static void main(String[] args) {
   
      Originator originator = new Originator();
      CareTaker careTaker = new CareTaker();
      
      originator.setState("State #1");
      careTaker.add(originator.saveStateToMemento());
      originator.setState("State #2");
      careTaker.add(originator.saveStateToMemento());
      
      originator.setState("State #3");
      careTaker.add(originator.saveStateToMemento());
      
      originator.setState("State #4");
      System.out.println("Current State: " + originator.getState());		
      
      originator.getStateFromMemento(careTaker.get(0));
      System.out.println("First saved State: " + originator.getState());
      originator.getStateFromMemento(careTaker.get(1));
      System.out.println("Second saved State: " + originator.getState());
   }
}