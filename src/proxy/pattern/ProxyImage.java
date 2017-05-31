
package proxy.pattern;

/**
 * project name: Design_Pattern
 * package name: proxy.pattern
 * file name: ProxyImage.java
 * project version: default
 * Created:
 * May 31, 2017, 11:21:08 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm
public class ProxyImage implements Image{

   private RealImage realImage;
   private String fileName;

   public ProxyImage(String fileName){
      this.fileName = fileName;
   }

   @Override
   public void display() {
      if(realImage == null){
         realImage = new RealImage(fileName);
      }
      realImage.display();
   }
}