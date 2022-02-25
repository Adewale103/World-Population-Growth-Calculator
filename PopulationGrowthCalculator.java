//To show the world's current population and the thrend for the next five years;
public class PopulationGrowthCalculator{
	public static void main(String[] args){

	double currentpop = 7953952567.0;
	double growthrate = 0.001;

	double onepop = ((7953952567.0 * growthrate) + 7953952567.0); 
	double secondpop = ((onepop * growthrate) + onepop);
	double thirdpop = ((secondpop * growthrate) + secondpop);
	double fourthpop = ((thirdpop * growthrate) + thirdpop);
	double fifthpop = ((fourthpop * growthrate) + fourthpop);

	System.out.println("The current population of the world is"+currentpop);
	System.out.println("The population of the world in a year is projected to be; "+onepop);
	System.out.println("The population of the world in the second year is projected to be; "+secondpop);
	System.out.println("The population of the world in the third year is projected to be; "+thirdpop);
	System.out.println("The population of the world in the fourth year is projected to be; "+fourthpop);
	System.out.println("The population of the world in the fifth year is projected to be; "+fifthpop);
}
}