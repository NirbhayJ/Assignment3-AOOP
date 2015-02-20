public class TerrestialPlanet extends Planet implements iHabitabel, iHasMoons 
{
	private boolean _oxygen;

	public TerrestialPlanet(double diameter, double mass, String name,boolean oxygen) 
	{
		super(diameter, mass, name);
		this._oxygen = oxygen;
	}

	public boolean habitable() 
	{
		return _oxygen;
	}

	public boolean hasMoons() 
	{
		if (super.getMoonCount() > 0) 
		{
			return true;
		}
		return false;
	}
	public String toString() 
	{
		return super.toString();
	}

}
