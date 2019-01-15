package GAStrategy;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
* This is my Population class which contains the Singleton Pattern. 
* The reason I use this pattern here is so that I only have 1 instance of my population. 
* This allows for my program to be working on the same data. 
* The generics are created and shown inside this class by having the Map. 
* @author harishankarsivaji
* 17250674
*/

public class Population {
	
	//This is the eagerly created implementation of the class. It is thread-safe 
	private static Population uniquePop = new Population();
	private static Map<Character,String> pop = new LinkedHashMap<Character,String>();
	
	//my private constructor. It can not be envoked by another class
	private Population() {
		pop=generatePopulation();//pop is then instantiated with some population
		toString();//test it works
	}
	//the getInstance() method allows only 1 instance of my population to be created.
	public static Population getInstance() {
		return uniquePop;
	}
	 
	/**
	 * This method will generate the population of the private global variable pop.
	 * Declared as private for encapsulation and information hiding purposes.
	 * @return created population
	 */

	private Map<Character,String> generatePopulation() {
		//the generated one to return
		Map<Character,String> genPop = new LinkedHashMap<Character,String>();
		//Generates a population with keys a the alphabet, and their respective binary numbers.
		for(int i =1; i < 64; i++) {
			genPop.put((char)(i+64), Integer.toBinaryString(i));
		}
		
		return genPop;
	}
	
	 /**
	  * This method will just print out the population.
	  */
	
	public String toString() {
		Set<Character> setPop = pop.keySet();//keys are characters
		Iterator<Character> iterator = setPop.iterator();//get the iterator
		while(iterator.hasNext()) {//whilst something inside the population
			Character letter = iterator.next();//get the letter(key)
			String binary = pop.get(letter);//get the associated value with this key
			System.out.println(letter + " : " + binary);
		}
		
		return "";
		
	}
	
}