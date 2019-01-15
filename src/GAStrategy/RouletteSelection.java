package GAStrategy;

public class RouletteSelection implements Selection {
	/**
	 * The constructor which is called in the GeneOne class will call the overwritten performSelection() method here.
	 * @param p The population to be worked on.
	 */
	public RouletteSelection( Population p) {
		performSelection(p);
	}
	
	/**
	 * After determining the fitness from the selection process the proportional fitness of each of the individuals is used find the better fitness.
	 * This roulette selection works by assigning each candidate a portion of the wheel depending on their fitness level.
	 * @param p 
	 * @return Population Object
	 */
	public Population performSelection(Population p) {
		System.out.println("\nStarting the roulette selection for Gene 1");
		System.out.println("Randomly selecting candidate for future population.");
		System.out.println("Candidates Selected.\n");
		return p;
	}

}
