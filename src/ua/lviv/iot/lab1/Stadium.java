package ua.lviv.iot.lab1;

public class Stadium {
	private int countOfSpectators;

	private String name;

	private double lightingPowerInLux;

	private String country;

	private int sizeOfFieldInSquareMeters;

	private static int COUNT_OF_STADIUMS = 0;

	protected int yearOfFoundation;

	protected double priceInMillionsOfDollars;

	public int getCountOfSpectators() {
		return countOfSpectators;
	}

	public void setCountOfSpectators(int countOfSpectators) {
		this.countOfSpectators = countOfSpectators;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLightingPowerInLux() {
		return lightingPowerInLux;
	}

	public void setLightingPowerInLux(double lightingPowerInLux) {
		this.lightingPowerInLux = lightingPowerInLux;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getsizeOfFieldInSquareMeters() {
		return sizeOfFieldInSquareMeters;
	}

	public void setsizeOfFieldInSquareMeters(int sizeOfFieldInSquareMeters) {
		this.sizeOfFieldInSquareMeters = sizeOfFieldInSquareMeters;
	}

	public Stadium() {
		COUNT_OF_STADIUMS++;
	}

	public Stadium(int countOfSpectators, String name, double lightingPowerInLux, String country,
			int sizeOfFieldInSquareMeters, int yearOfFoundation, double priceInMillionsOfDollars) {
		this.countOfSpectators = countOfSpectators;
		this.name = name;
		this.lightingPowerInLux = lightingPowerInLux;
		this.country = country;
		this.sizeOfFieldInSquareMeters = sizeOfFieldInSquareMeters;
		this.yearOfFoundation = yearOfFoundation;
		this.priceInMillionsOfDollars = priceInMillionsOfDollars;
		COUNT_OF_STADIUMS++;
	}

	public Stadium(int countOfSpectators, String name, double lightingPowerInLux, String country,
			int sizeOfFieldInSquareMeters) {
		this(countOfSpectators, name, lightingPowerInLux, country, sizeOfFieldInSquareMeters, 0, 0.0);
	}

	public String toString() {
		System.out.println("countOfSpectators=" + countOfSpectators + ", name=" + name + ", lightingPowerInLux="
				+ lightingPowerInLux + ", country=" + country + ", sizeOfFieldInSquareMeters="
				+ sizeOfFieldInSquareMeters + ", yearOfFoundation=" + yearOfFoundation + ", priceInMillionsOfDollars="
				+ priceInMillionsOfDollars + "]");
		return "Stadion1 [countOfSpectators=" + countOfSpectators + ", name=" + name + ", lightingPowerInLux="
				+ lightingPowerInLux + ", country=" + country + ", sizeOfFieldInSquareMeters="
				+ sizeOfFieldInSquareMeters + ", yearOfFoundation=" + yearOfFoundation + ", priceInMillionsOfDollars="
				+ priceInMillionsOfDollars + "]";
	}

	public String resetValues(int countOfSpectators, String name, double lightingPowerInLux, String country,
			int sizeOfFieldInSquareMeters, int yearOfFoundation, double priceInMillionsOfDollars) {
		this.countOfSpectators = countOfSpectators;
		this.name = name;
		this.lightingPowerInLux = lightingPowerInLux;
		this.country = country;
		this.sizeOfFieldInSquareMeters = sizeOfFieldInSquareMeters;
		this.yearOfFoundation = yearOfFoundation;
		this.priceInMillionsOfDollars = priceInMillionsOfDollars;
		return "Stadion1 [countOfSpectators=" + countOfSpectators + ", name=" + name + ", lightingPowerInLux="
				+ lightingPowerInLux + ", country=" + country + ", sizeOfFieldInSquareMeters="
				+ sizeOfFieldInSquareMeters + ", yearOfFoundation=" + yearOfFoundation + ", priceInMillionsOfDollars="
				+ priceInMillionsOfDollars + "]";
	}

	public static int printStaticCountOfStadiums() {
		System.out.println(Stadium.COUNT_OF_STADIUMS);
		return COUNT_OF_STADIUMS;
	}

	public int printCountOfStadiums() {
		System.out.println(Stadium.COUNT_OF_STADIUMS);
		return COUNT_OF_STADIUMS;
	}

}
