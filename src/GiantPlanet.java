
public class GiantPlanet extends Planet implements iHasMoons, iHasRings {
	//Instance Variables
	public String _type;

	public GiantPlanet(double diameter, double mass, String name, String type) 
	{
		super(diameter, mass, name);
		_type = type;
		
	}//constructor ends
	
	 //This method checks if the planet has moons.
	 //return true if it has at least one moon, else false;

	public boolean hasMoons() {
		if (super.getMoonCount() > 0) {
			return true;
		}
		return false;
	}//method hasMoons ends

	// This method checks if the planet has rings.
		 //return true if it has at least one ring, else false;
		 
	public boolean hasRings() {
		if (super.getRingCount() > 0) {
			return true;
		}
		return false;
	}//method hasRings ends

	
	 

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}//class GiantPlanet ends
