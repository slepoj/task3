package train.com.planets;

public class Mars extends Planet implements PlanetAcceleration {

    @Override
    public double acceleration() {
        return 0;
    }
}
