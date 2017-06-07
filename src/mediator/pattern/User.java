
package mediator.pattern;

/**
 * project name: Design_Pattern
 * package name: mediator.pattern
 * file name: User.java
 * project version: default
 * Created:
 * Jun 7, 2017, 9:22:12 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/mediator_pattern.htm
public class User {
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public User(String name){
      this.name  = name;
   }

   public void sendMessage(String message){
      ChatRoom.showMessage(this,message);
   }
}