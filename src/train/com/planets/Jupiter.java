package train.com.planets;

public class Jupiter extends Planet implements PlanetAcceleration {

    @Override
    public double acceleration() {
        return 0;
    }
}
