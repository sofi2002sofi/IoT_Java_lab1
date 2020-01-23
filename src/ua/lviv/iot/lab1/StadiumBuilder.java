package ua.lviv.iot.lab1;

public class StadiumBuilder {

	static final int countOfExtraStadiums = 4;
	static Stadium[] extraStadiums = new Stadium[countOfExtraStadiums];
	static int extraStadiumNumber;

	public static void main(String[] args) {
		Stadium arenaLviv = new Stadium();

		Stadium stadeDeFrance = new Stadium(81680, "Stade de France", 2000.0, "France", 5664, 2003, 400.0);

		Stadium estadeDaLuz = new Stadium(60000, "Estade da Luz", 1800, "Portugal", 7140);

		estadeDaLuz.toString();
		arenaLviv.toString();
		stadeDeFrance.toString();

		estadeDaLuz.resetValues(30000, "finic", 5000.0, "Spain", 3456, 2000, 160);
		estadeDaLuz.toString();

		Stadium.printStaticCountOfStadiums();
		arenaLviv.printCountOfStadiums();

		extraStadiumNumber = 0;
		do {
			extraStadiums[extraStadiumNumber] = new Stadium();
			extraStadiumNumber++;
		} while (extraStadiumNumber < countOfExtraStadiums);

		for (Stadium stadium : extraStadiums) {
			System.out.println(stadium);
		}

	}

}
