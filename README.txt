To compile and run, navigate to the src folder 

How to compile and run my code:

javac *.java
java Runner

Sample Output:

A : 1
B : 10
C : 11
D : 100
E : 101
...
...
} : 111101
~ : 111110
 : 111111

88558700 (Hashcode)

Choosing Gene1 of GA generation with Roulette selection and 1 point crossover.

Starting the roulette selection for Gene 1
Randomly selecting candidate for future population.
Candidates Selected.

Performing one point crossover for the selected population
Selecting bits to crossover.
Completed One Point Crossover !

Crossover performed:GAStrategy.OnePointCrossover@7e0babb1, 
Selection performed:  GAStrategy.RouletteSelection@7cf10a6f, 
Mutation performed: null

Output Explanation:
Firstly, the Print stmt stating what is to be performed. 
This will be Roulette selection and 1 point crossover. So initally then Roulette Selection is performed.
This will go down through the relevant classes of the Abstract Factory until it can create the RouletteSelection class inside the relevant GeneOne class. 
Once the correct Selection class is instantiated, The process is selected and perfomed. This will return the first block of the above printout. 

A user also inputs that they want to perform 1 point crossover on the population. 
This is done again by going down through the Abstract Factory, and when inside the relevant Gene class it will create the passed in type of Crossover. 
This will return the second block of the above printout which talks about Crossover. 

The next line is just printing out the references to the objects which are created at runtime based on the users input.

The concept of Genetic algorithm is implemented using Singleton Pattern, Abstract Factory Pattern and Strategy Pattern. There are different calls which are commented is for future development.
