
package proxy.pattern;

/**
 * project name: Design_Pattern
 * package name: proxy.pattern
 * file name: RealImage.java
 * project version: default
 * Created:
 * May 31, 2017, 11:20:26 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm
public class RealImage implements Image {

   private String fileName;

   public RealImage(String fileName){
      this.fileName = fileName;
      loadFromDisk(fileName);
   }

   @Override
   public void display() {
      System.out.println("Displaying " + fileName);
   }

   private void loadFromDisk(String fileName){
      System.out.println("Loading " + fileName);
   }
}