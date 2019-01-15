
import GAStrategy.*;
import GAFactory.*;

/**
 * This is the Runner class.
 * Singleton Pattern is implemented here.
 * I have one gene example here which implements a GeneticFactory by giving it a type of GeneOne. 
 * The GeneOne decides at runtime which of the process to select during runtime.
 * @author harishankarsivaji
 * 17250674
 */
public class Runner{

	public static void main(String...args) {
		
		 // This will return an instance of the class
		Population pop=Population.getInstance();
		System.out.println(pop.hashCode());
		
		Factory obj1 = new GeneOne();
		//Factory obj2 = new GeneTwo();
		
		System.out.println("\nChoosing Gene1 of GA generation with Roulette selection and 1 point crossover.");
		@SuppressWarnings("unused")
		Object style1 = obj1.doProcess("roulette",1,pop);
		
		//This will get the crossover, selection and mutation that was created
		System.out.println("\nCrossover performed:"+obj1.getCrossover() + ", Selection performed:  "+obj1.getSelection() + ", Mutation performed: " + obj1.getMutation());
		
		//System.out.println("\nChoosing Gene2 of GA generation with Elite selection and 1 point crossover..");
		//Object style2 =obj2.doProcess("elite", 2,pop);
		//System.out.println("\nCrossover performed:"+obj2.getCrossover() + ", Selection performed:  "+obj2.getSelection() + ", Mutation performed: " + obj2.getMutation());
		
		//System.out.println("\nDoing config1 of GA generation with roulette selection and 2 point crossover.");
		//Object style3 =obj1.doProcess("roulette", 2,pop);
		//System.out.println("\nCrossover performed:"+obj1.getCrossover() + ", Selection performed:  "+obj1.getSelection() + ", Mutation performed: " + obj1.getMutation());

	}
	
}
