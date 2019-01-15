package GAStrategy;

/**
 * This class is a interface which performs the Mutation function
 * which will be extended by the subclasses and implement their own function on this.
 * The type of function used for mutation is Single Point Mutation.
 * 
 * @author harishankarsivaji
 * 17250674
 */

public interface  Mutation {
	/**
	 * mutate() is an abstract method which implements Single point mutate function.
	 * @param p
	 * @return Population Object
	 */
	public abstract Population mutate(Population p);
}