package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double d = 0.0;
		d= population*1.5;
		d=d*growthRate;
		System.out.println(d);
		return d;
	}

}
