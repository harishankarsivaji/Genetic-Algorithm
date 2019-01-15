package GAFactory;

import GAStrategy.*;


public class GeneTwo extends Factory {

	/**
	 * This method will generate a new class of one of the crossover classes that are for this Gene.
	 * Elite Selection.
	 * @param String type, Population p
	 * @return Selection
	 */
	protected Selection selectionChoice(String type, Population p) {
		// TODO Auto-generated method stub
		if(type.equals("elite")) {
			return new EliteSelection(p);
		}else throw new IllegalArgumentException("Illegal Argument" + type);
	}

	/**
	 * crossoverChoice() will generate a new class of one of the crossover classes that are for this Gene.
	 * @param int numCross the type of crossover, Population p
	 * @return Crossover object
	 */
	protected Crossover crossoverChoice(int numCross, Population p) {
		if(numCross == 1) {
			return new OnePointCrossover(p);
			
		}else if(numCross == 2) {
			return new TwoPointCrossover(p);
		}else throw new IllegalArgumentException("Illegal Argument" + numCross);
	}
	
	/**
	 * The mutationChance() is just the normal type of mutation. It has a 10% chance of being called.
	 * The return can be null as it was not executed.
	 * @param Population p
	 * @return Mutation
	 */
	protected Mutation mutationChance(String type,Population p) {
		// TODO Auto-generated method stub
		double num = Math.random();
		if(num<0.1) {
			return new SinglePointMutate(p);
		}
		return null;
	}

}
