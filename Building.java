
public class Building implements CarbonFootprint{
	//We have found the carbon footprint that will form depending on what a building is working with.
	private static double COAL_PER_ONE_KWH = .00034;
	private static double ELECTRICITY_PER_ONE_KWH = .00059;
	private static double HEATING_OIL_PER_ONE_KWH = .00028;
	private static double LPG_PER_ONE_KWH = .00021;
	private static double NATURAL_GAS_PER_ONE_KWH = .00018;
	private static double PROPANE_PER_ONE_GALLON = .00579;
	private static double WOODEN_PELLETS_PER_ONE_METRIC_TON = .00774;
	
	
	
	private double coal;
	private double electricity;
	private double heatingOil;
	private String id;
	private double lpg;
	private double naturalGas;
	private int numberOfPeople;
	private double propane;
	private double woodenPellets;
	
	public Building(String id, int numberOfPeople, double electricity,double naturalGas, double heatingOil, double coal,
			double lpg,double propane, double woodenPellets) {

		this.setId(id);
		this.setNumberOfPeople(numberOfPeople);
		this.setElectricity(electricity);
		this.setNaturalGas(naturalGas);
		this.setHeatingOil(heatingOil);
		this.setCoal(coal);
		this.setLpg(lpg);
		this.setPropane(propane);
		this.setWoodenPellets(woodenPellets);
	}

	//We have created our get and sets.
	public double getCoal() {
		return coal;
		
	}
	public void setCoal(double coal) {
		this.coal = coal;
		
	}
	public double getElectricity() {
		return electricity;
		
	}
	public void setElectricity(double electricity) {
		this.electricity = electricity;
		
	}
	public double getHeatingOil() {
		return heatingOil;
		
	}
	public void setHeatingOil(double heatingOil) {
		this.heatingOil = heatingOil;
		
	}
	public String getId() {
		return id;
		
	}
	public void setId(String id) {
		this.id = id;
		
	}
	public double getLpg() {
		return lpg;
		
	}
	public void setLpg(double lpg) {
		this.lpg = lpg;
		
	}
	public double getNaturalGas() {
		return naturalGas;
		
	}
	public void setNaturalGas(double naturalGas) {
		this.naturalGas = naturalGas;
		
	}
	public int getNumberOfPeople() {
		return numberOfPeople;
		
	}
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	
	public double getPropane() {
		return propane;
		
	}
	public void setPropane(double propane) {
		this.propane = propane;
		
	}
	public double getWoodenPellets() {
		return woodenPellets;
		
	}
	public void setWoodenPellets(double woodenPellets) {
		this.woodenPellets = woodenPellets;
	}


	public static double getCOAL_PER_ONE_KWH() {
		return COAL_PER_ONE_KWH;
	}


	public static void setCOAL_PER_ONE_KWH(double cOAL_PER_ONE_KWH) {
		COAL_PER_ONE_KWH = cOAL_PER_ONE_KWH;
	}


	public static double getELECTRICITY_PER_ONE_KWH() {
		return ELECTRICITY_PER_ONE_KWH;
	}


	public static void setELECTRICITY_PER_ONE_KWH(double eLECTRICITY_PER_ONE_KWH) {
		ELECTRICITY_PER_ONE_KWH = eLECTRICITY_PER_ONE_KWH;
	}


	public static double getHEATING_OIL_PER_ONE_KWH() {
		return HEATING_OIL_PER_ONE_KWH;
	}


	public static void setHEATING_OIL_PER_ONE_KWH(double hEATING_OIL_PER_ONE_KWH) {
		HEATING_OIL_PER_ONE_KWH = hEATING_OIL_PER_ONE_KWH;
	}


	public static double getLPG_PER_ONE_KWH() {
		return LPG_PER_ONE_KWH;
	}


	public static void setLPG_PER_ONE_KWH(double lPG_PER_ONE_KWH) {
		LPG_PER_ONE_KWH = lPG_PER_ONE_KWH;
	}


	public static double getNATURAL_GAS_PER_ONE_KWH() {
		return NATURAL_GAS_PER_ONE_KWH;
	}


	public static void setNATURAL_GAS_PER_ONE_KWH(double nATURAL_GAS_PER_ONE_KWH) {
		NATURAL_GAS_PER_ONE_KWH = nATURAL_GAS_PER_ONE_KWH;
	}


	public static double getPROPANE_PER_ONE_GALLON() {
		return PROPANE_PER_ONE_GALLON;
	}


	public static void setPROPANE_PER_ONE_GALLON(double pROPANE_PER_ONE_GALLON) {
		PROPANE_PER_ONE_GALLON = pROPANE_PER_ONE_GALLON;
	}


	public static double getWOODEN_PELLETS_PER_ONE_METRIC_TON() {
		return WOODEN_PELLETS_PER_ONE_METRIC_TON;
	}


	public static void setWOODEN_PELLETS_PER_ONE_METRIC_TON(double wOODEN_PELLETS_PER_ONE_METRIC_TON) {
		WOODEN_PELLETS_PER_ONE_METRIC_TON = wOODEN_PELLETS_PER_ONE_METRIC_TON;
	}
	
	public double getCarbonFootprint() {
		double carbonFootprint = 0;

		carbonFootprint = (getElectricity()*getELECTRICITY_PER_ONE_KWH())+(getNaturalGas()*getNATURAL_GAS_PER_ONE_KWH())+
				(getHeatingOil() * getHEATING_OIL_PER_ONE_KWH())+ 
				(getCoal()*getCOAL_PER_ONE_KWH())+ 
				(getLpg()*getLPG_PER_ONE_KWH()) + 
				(getPropane()*getPROPANE_PER_ONE_GALLON())+ 
				(getWoodenPellets()*(getWOODEN_PELLETS_PER_ONE_METRIC_TON()));
		
		return carbonFootprint;

	}
	
	//our printing code
	public String toString() {
		
		StringBuilder string = new StringBuilder();
		string.append(getId());
		string.append("\nNumber of people: " + getNumberOfPeople());
		if (getElectricity() > 0) {
			string.append("\nElectricity used (kWh): "+ getElectricity());
		}
		if (getNaturalGas() > 0) {
			string.append("\nNatural Gas used (kWh): "	+ getNaturalGas());
		}
		if (getHeatingOil() > 0) {
			string.append("\nHeating Oil used (kWh): "	+ getHeatingOil());
		}
		if (getCoal() > 0) {
			string.append("\nCoal used (kWh): "	+ getCoal());
		}
		if (getLpg() > 0) {
			string.append("\nLPG used (kWh): "	+ getLpg());
		}
		if (getPropane() > 0) {
			string.append("\nPropane used (Gallons): "	+ getPropane());
		}
		if (getWoodenPellets() > 0) {
			string.append("\nWooden Pellets used (Metric Tons): "+ getWoodenPellets());
		}
		return string.toString();
	
}
}
