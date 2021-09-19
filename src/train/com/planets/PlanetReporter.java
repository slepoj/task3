package train.com.planets;

public class PlanetReporter {

    public static void printInfoOfPlanet(Planet planet){
        System.out.print("g in " + planet.getClass().getSimpleName() + " is ");
        System.out.printf("%.2f\n", planet.g);
    }
}
