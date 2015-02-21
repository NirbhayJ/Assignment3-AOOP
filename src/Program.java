/**
 * This program contains main class.
 * Nirbhay Jadhav
 * February 20, 2015
 * 
 * version History
 * 1.01:
 * Created project and abstract Planet class, Added interfaces.
 * 
 * 1.02:
 *Created the GiantPlanet class and the TerrestrialPlanet class.created program class.
 * 
 * 1.03
 *  comments program
 */
public class Program 
{

	public static void main(String args[]) 
	{

		TerrestialPlanet Mercury = new TerrestialPlanet(30, 6000, " Mercury", true);
		System.out.println(Mercury);
		
		GiantPlanet Neptune = new GiantPlanet(20, 4000, "Neptune", "Gas");
		System.out.println(Neptune);
	}
}
