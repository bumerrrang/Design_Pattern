
package proxy.pattern;

/**
 * project name: Design_Pattern
 * package name: proxy.pattern
 * file name: ProxyPatternDemo.java
 * project version: default
 * Created:
 * May 31, 2017, 11:22:42 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm
public class ProxyPatternDemo {
	
   public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");

      //image will be loaded from disk
      image.display(); 
      System.out.println("");
      
      //image will not be loaded from disk
      image.display(); 	
   }
}