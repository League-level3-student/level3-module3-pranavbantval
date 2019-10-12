package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double d = 0.0;
		d=population*growthRate;
		d+=1000000;
		return d;
	}
}
