
package nullobject.pattern;

/**
 * project name: Design_Pattern
 * package name: nullobject.pattern
 * file name: AbstractCustomer.java
 * project version: default
 * Created:
 * Jun 14, 2017, 9:31:43 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/null_object_pattern.htm
public abstract class AbstractCustomer {
   protected String name;
   
   public abstract boolean isNil();
   public abstract String getName();
}