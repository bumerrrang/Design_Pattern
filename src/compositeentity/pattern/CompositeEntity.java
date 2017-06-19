
package compositeentity.pattern;

/**
 * project name: Design_Pattern
 * package name: compositeentity.pattern
 * file name: CompositeEntity.java
 * project version: default
 * Created:
 * Jun 19, 2017, 11:11:38 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/composite_entity_pattern.htm
public class CompositeEntity {
   private CoarseGrainedObject cgo = new CoarseGrainedObject();

   public void setData(String data1, String data2){
      cgo.setData(data1, data2);
   }

   public String[] getData(){
      return cgo.getData();
   }
}