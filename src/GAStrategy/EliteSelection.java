package GAStrategy;

/**
 * This class is a subclass of the interface Selection.
 * It is a generic version of elite selection that is implemented by the GeneTwo class
 * They implement their version of the performSelection() method.
 * @author harishankarsivaji
 * 17250674
 */
public class EliteSelection implements Selection {

	/**
	 *  * The constructor which is called in the configTwo class will call the overwritten performSelection() method here.
	 * This could be done by say having class variables in Selection itself, i.e. name, status, etc. 
	 * But for simplicity I am just having print stmts here to it. 
	 * @param p
	 */
	public EliteSelection(Population p) {
		performSelection(p);
	}

	/**
	 * This version of select is the elite version. This is where the candidates are sorted on their fitness level first.
	 * They are then chosen based on the fittest. Candidates at the top have a higher chance of being picked.
	 * @param p 
	 * @return Population Object
	 */
	
	public Population performSelection(Population p) {
		System.out.println("\nStarting the elite selection for Gene 2.");
		System.out.println("Sorting the candidates from Smallest to Biggest.");
		System.out.println("Choosing the best candidates in this group.");
		System.out.println("Candidates selected\n");
		return p;
	}
}