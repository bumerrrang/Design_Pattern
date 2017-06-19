
package compositeentity.pattern;

/**
 * project name: Design_Pattern
 * package name: compositeentity.pattern
 * file name: Client.java
 * project version: default
 * Created:
 * Jun 19, 2017, 11:12:40 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/composite_entity_pattern.htm
public class Client {
   private CompositeEntity compositeEntity = new CompositeEntity();

   public void printData(){
   
      for (int i = 0; i < compositeEntity.getData().length; i++) {
         System.out.println("Data: " + compositeEntity.getData()[i]);
      }
   }

   public void setData(String data1, String data2){
      compositeEntity.setData(data1, data2);
   }
}