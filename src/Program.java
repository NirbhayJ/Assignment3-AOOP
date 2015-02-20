public class Program {

	public static void main(String args[]) 
	{

		TerrestialPlanet Mercury = new TerrestialPlanet(30, 6000, " Mercury", true);
		System.out.println( Mercury);
		
		GiantPlanet Neptune = new GiantPlanet(20, 4000, "Neptune", "Gas");
		System.out.println(Neptune);
	}
}
