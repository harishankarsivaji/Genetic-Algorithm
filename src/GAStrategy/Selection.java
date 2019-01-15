package GAStrategy;

/**
 * This class is a interface which performs the Selection function
 * which will be extended by the subclasses and implement their own function on this.
 * The type of function used for Selection is Elite selection and Roulette selection.
 * 
 * @author harishankarsivaji
 * 17250674
 */

public interface Selection {
	/**
	 * performSelection() is an abstract method which implements the different types of selection.
	 * @param pop
	 * @return
	 */
	abstract Population performSelection(Population pop);
}
