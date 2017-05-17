/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder.pattern;

/**
 * project name: Design_Pattern
 * package name: builder.pattern
 * file name: ColdDrink.java
 * project version: default
 * Created:
 * May 12, 2017, 12:37:57 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
            return new Bottle();
	}

	@Override
	public abstract float price();
}