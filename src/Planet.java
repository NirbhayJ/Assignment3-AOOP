/**
 * abstract class , Subclasses can extend
 * Nirbhay Jadhav
 * February 20, 2015
 */
public abstract class Planet {

	private double _diameter;
	private double _mass;
	private int _moonCount;
	private String _name;
	private double _orbitalPeriod;
	private int _ringCount;
	private double _rotationPeriod;

	public Planet(double diameter, double mass, String name) {
		super();
		this._diameter = diameter;
		this._mass = mass;
		this._name = name;
	}

	public int getMoonCount() 
	{
		return _moonCount;
	}
	 //This method sets the number of moons the planet has.
	 //@param moonCount The number of moons the planet has.
	
	public void setMoonCount(int moonCount) 
	{
		this._moonCount = moonCount;
	}

	public double getOrbitalPeriod() {
		return _orbitalPeriod;
	}

	 // This method sets the orbital period of the planet
	 // @param orbitalPeriod The orbital planet of the planet.
	 
	public void setOrbitalPeriod(double orbitalPeriod) {
		this._orbitalPeriod = orbitalPeriod;
	}

	public int getRingCount() {
		return _ringCount;
	}

	
	//This method sets the number of rings the planet has.
	//@param ringCount The number of rings the planet has.
	 
	public void setRingCount(int ringCount) {
		this._ringCount = ringCount;
	}

	public double getRotationPeriod() {
		return _rotationPeriod;
	}

	 // This method sets the rotation period of the planet.
	 // @param rotationPeriod The rotation period of the planet.
	 
	public void setRotationPeriod(double rotationPeriod) {
		this._rotationPeriod = rotationPeriod;
	}

	public double getDiameter() {
		return _diameter;
	}

	public double getMass() {
		return _mass;
	}

	public String getName() {
		return _name;
	}

	// This method returns information about the planet.
	 //return the planet's name, diameter and mass.

	public String toString() {
		String planetInfo = "Name: " + getName()
				+ "\nDiameter: " + getDiameter()
				+ "\nMass: " + getMass() + "\n";
		return planetInfo;
	}

}
