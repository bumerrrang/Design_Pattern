
package observer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * project name: Design_Pattern
 * package name: observer.pattern
 * file name: Subject.java
 * project version: default
 * Created:
 * Jun 7, 2017, 9:38:03 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
public class Subject {
	
   private List<Observer> observers = new ArrayList<Observer>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
}