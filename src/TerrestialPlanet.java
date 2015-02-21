 /* This program creates TerrestialPlanet.
 * Nirbhay Jadhav
 * February 20, 2015
 */
public class TerrestialPlanet extends Planet implements iHabitabel, iHasMoons 
{
	//Instance Variables
	private boolean _oxygen;
	//constructor starts
	public TerrestialPlanet(double diameter, double mass, String name,boolean oxygen) 
	{
		super(diameter, mass, name);
		this._oxygen = oxygen;
	}//constructor ends
	
	 // This method checks if the planet is habitable.
	 //return true if the planet has oxygen, else false.
	public boolean habitable() 
	{
		return _oxygen;
	}//method habitable ends
	
	 // This method checks if the planet has moons.
	 //return true if it has at least one moon, else false;
	public boolean hasMoons() 
	{
		if (super.getMoonCount() > 0) 
		{
			return true;
		}
		return false;
	}//method hasMoon ends
	
	public String toString() 
	{
		return super.toString();
	}

}
