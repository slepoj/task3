package train.com.planets;

public class Neptune extends Planet implements PlanetAcceleration {

    @Override
    public double acceleration() {
        return 0;
    }
}
