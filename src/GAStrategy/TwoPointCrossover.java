package GAStrategy;

public class TwoPointCrossover implements Crossover {
	
	/**
	 * The constructor which is called in the GeneOne class will call the overwritten doCrossover() method here.
	 * @param p
	 */
	public TwoPointCrossover(Population p) {
		doCrossover(p);
	}
	/**
	 * This performs doCrossover() for ConfigOne and does Two Point style.
	 * @param p the population to be worked on
	 * @return Population object
	 */
	public Population doCrossover(Population p) {
		System.out.println("Performing 2 point crossover for the selected population");
		System.out.println("Selecting bits to crossover");
		System.out.println("Completed Two Point crossover !");
		return p;
	}

}
