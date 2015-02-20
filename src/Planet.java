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

	public void setMoonCount(int moonCount) 
	{
		this._moonCount = moonCount;
	}

	public double getOrbitalPeriod() {
		return _orbitalPeriod;
	}

	public void setOrbitalPeriod(double orbitalPeriod) {
		this._orbitalPeriod = orbitalPeriod;
	}

	public int getRingCount() {
		return _ringCount;
	}

	public void setRingCount(int ringCount) {
		this._ringCount = ringCount;
	}

	public double getRotationPeriod() {
		return _rotationPeriod;
	}

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

	public String toString() {
		return "Planet [diameter=" + _diameter + ", mass=" + _mass + ", name="
				+ _name + "]";
	}

}
