
package memento.pattern;

/**
 * project name: Design_Pattern
 * package name: memento.pattern
 * file name: Originator.java
 * project version: default
 * Created:
 * Jun 7, 2017, 9:29:55 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/memento_pattern.htm
public class Originator {
   private String state;

   public void setState(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }

   public Memento saveStateToMemento(){
      return new Memento(state);
   }

   public void getStateFromMemento(Memento memento){
      state = memento.getState();
   }
}