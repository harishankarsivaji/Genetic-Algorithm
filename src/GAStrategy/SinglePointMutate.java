package GAStrategy;

public class SinglePointMutate implements Mutation {
	/**
	 * This will call the actual mutate method on the population.
	 * @param p The population object
	 */
	public SinglePointMutate(Population p) {
		mutate(p);
	}
	/**
	 * This method performs the normal type of mutation, which is it occurs only 10% of the time.
	 * @param p The population to be worked on
	 * @return Population
	 */
	public Population mutate(Population p) {
		System.out.println("\nPerforming normal mutate.");
		System.out.println("Selected the bits to flip.");
		System.out.println("Done mutation.");
		return p;
	}

}