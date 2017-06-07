
package memento.pattern;

/**
 * project name: Design_Pattern
 * package name: memento.pattern
 * file name: Memento.java
 * project version: default
 * Created:
 * Jun 7, 2017, 9:29:06 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/memento_pattern.htm
public class Memento {
   private String state;

   public Memento(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }	
}