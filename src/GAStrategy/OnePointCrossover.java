package GAStrategy;

public class OnePointCrossover implements Crossover {

	/**
	 * The constructor which is called in the GeneOne class will call the overwritten doCrossover() method here.
	 * @param p
	 */
	
	public OnePointCrossover(Population p) {
		doCrossover(p);
	}
	
	/**
	 * This performs doCrossover() for ConfigOne and does Two Point style.
	 * 
	 * @param p the population to be worked on
	 * @return Population the Population object
	 */
	 public Population doCrossover(Population p) {
		System.out.println("Performing one point crossover for the selected population");
		System.out.println("Selecting bits to crossover.");
		System.out.println("Completed One Point Crossover !");
		return p;
	 }
}