
public class GiantPlanet extends Planet implements iHasMoons, iHasRings {

	public String _type;

	public GiantPlanet(double diameter, double mass, String name, String type) {
		super(diameter, mass, name);
		this._type = type;
		
	}

	public boolean hasMoons() {
		if (super.getMoonCount() > 0) {
			return true;
		}
		return false;
	}

	public boolean hasRings() {
		if (super.getRingCount() > 0) {
			return true;
		}
		return false;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
