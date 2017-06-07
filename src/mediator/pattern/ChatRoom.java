
package mediator.pattern;

import java.util.Date;

/**
 * project name: Design_Pattern
 * package name: mediator.pattern
 * file name: ChatRoom.java
 * project version: default
 * Created:
 * Jun 7, 2017, 9:21:13 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/mediator_pattern.htm
public class ChatRoom {
   public static void showMessage(User user, String message){
      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
   }
}