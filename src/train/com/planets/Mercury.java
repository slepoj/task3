package train.com.planets;

public class Mercury extends Planet implements PlanetAcceleration {

    @Override
    public double acceleration() {
        return 0;
    }
}
