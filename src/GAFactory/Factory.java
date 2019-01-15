package GAFactory;

import GAStrategy.*;

/**
 * This is the Abstract Factory. 
 * The method doProcess() is the main method which creates objects of Selection, Crossover and Mutation. 
 * Includes 3 abstract methods which are implemented in the subclasses.
 * @author harishankarsivaji
 * 17250674
 */
public abstract class Factory {
	Selection select;
	Crossover cross;
	Mutation mutate;
	/**
	 * Main method, depending on the configuration that was instantiated in Runner.
	 * @param  the type of Selection to perform
	 * @param  numCross the type of crossover to perform.
	 * @param  p, the Population to be worked on. 
	 * @return Object
	 */
	public Object doProcess(String type, int numCross, Population p){
		select = selectionChoice(type,p);
		cross = crossoverChoice(numCross,p);
		mutate=mutationChance(type,p);
		return null;
	}
	
	public Selection getSelection() {
		return select;
	}
	public Crossover getCrossover() {
		return cross;
	}
	public Mutation getMutation() {
		return mutate;
	}

	/**
	 * This method is defined in all relevant Gene. 
	 * Each one alters this to suit their needs.
	 * @param type
	 * @param p
	 * @return Selection
	 */
	protected abstract Selection selectionChoice(String type,Population p);
	
	/**
	 * This method is defined in all relevant Gene. 
	 * Each one alters this to suit their needs.
	 * @param type
	 * @param p
	 * @return Crossover
	 */
	protected abstract Crossover crossoverChoice(int numCross, Population p);
	
	/**
	 * This method is defined in all relevant Gene. 
	 * Each one alters this to suit their needs.
	 * @param type
	 * @param p
	 * @return Mutation
	 */
	protected abstract Mutation mutationChance(String type,Population p);
}
