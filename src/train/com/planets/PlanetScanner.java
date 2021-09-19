package train.com.planets;

import java.util.Scanner;

public class PlanetScanner {

    public void start() {
        while (true) {
            System.out.println("Select number of planet:\n" +
                    "1. Mercury\n" +
                    "2. Venus\n" +
                    "3. Earth\n" +
                    "4. Mars\n" +
                    "5. Jupiter\n" +
                    "6. Saturn\n" +
                    "7. Uranus\n" +
                    "8. Neptune\n" +
                    "0. Exit");
            Scanner scanner = new Scanner(System.in);
            int pl = scanner.nextInt();
            switch (pl) {
                case 1: {
                    Mercury mercury = new Mercury();
                    mercury.acceleration();
                    PlanetReporter.printInfoOfPlanet(mercury);
                    break;
                }
                case 2: {
                    Venus venus = new Venus();
                    venus.acceleration();
                    PlanetReporter.printInfoOfPlanet(venus);
                    break;
                }
                case 3: {
                    Earth earth = new Earth();
                    earth.acceleration();
                    PlanetReporter.printInfoOfPlanet(earth);
                    break;
                }
                case 4: {
                    Mars mars = new Mars();
                    mars.acceleration();
                    PlanetReporter.printInfoOfPlanet(mars);
                    break;
                }
                case 5: {
                    Jupiter jupiter = new Jupiter();
                    jupiter.acceleration();
                    PlanetReporter.printInfoOfPlanet(jupiter);
                    break;
                }
                case 6: {
                    Saturn saturn = new Saturn();
                    saturn.acceleration();
                    PlanetReporter.printInfoOfPlanet(saturn);
                    break;
                }
                case 7: {
                    Uranus uranus = new Uranus();
                    uranus.acceleration();
                    PlanetReporter.printInfoOfPlanet(uranus);
                    break;
                }
                case 8: {
                    Neptune neptune = new Neptune();
                    neptune.acceleration();
                    PlanetReporter.printInfoOfPlanet(neptune);
                    break;
                }
                case 0: return;
                default: {
                    System.out.println("Incorrect number");
                    break;
                }
            }
        }
    }
}
