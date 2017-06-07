
package memento.pattern;

import java.util.*;

/**
 * project name: Design_Pattern
 * package name: memento.pattern
 * file name: CareTaker.java
 * project version: default
 * Created:
 * Jun 7, 2017, 9:30:44 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/memento_pattern.htm
public class CareTaker {
   private List<Memento> mementoList = new ArrayList<Memento>();

   public void add(Memento state){
      mementoList.add(state);
   }

   public Memento get(int index){
      return mementoList.get(index);
   }
}