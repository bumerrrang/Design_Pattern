
package interceptingfilter.pattern;

/**
 * project name: Design_Pattern
 * package name: interceptingfilter.pattern
 * file name: Filter.java
 * project version: default
 * Created:
 * Jun 21, 2017, 11:22:09 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/intercepting_filter_pattern.htm
public interface Filter {
   public void execute(String request);
}