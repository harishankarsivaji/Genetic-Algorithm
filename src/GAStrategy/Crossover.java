package GAStrategy;

/**
 * This class is a interface which performs the crossover function 
 * which will be extended by the subclasses and implement their own function on this.
 * The two types of functions used in the subclasses are Single point crossover and Two point crossover
 * 
 * @author harishankarsivaji
 * 12750674
 */

public interface Crossover {
	/**
	 * doCrossover() is an abstract method which implements the different types of crossover. 
	 * @param p
	 * @return Population object
	 */
	abstract Population doCrossover(Population p);
}
