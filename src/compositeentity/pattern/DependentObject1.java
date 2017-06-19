
package compositeentity.pattern;

/**
 * project name: Design_Pattern
 * package name: compositeentity.pattern
 * file name: DependentObject1.java
 * project version: default
 * Created:
 * Jun 19, 2017, 11:08:42 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/composite_entity_pattern.htm
public class DependentObject1 {
	
   private String data;

   public void setData(String data){
      this.data = data; 
   } 

   public String getData(){
      return data;
   }
}