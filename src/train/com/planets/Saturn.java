package train.com.planets;

public class Saturn extends Planet implements PlanetAcceleration {

    @Override
    public double acceleration() {
        return 0;
    }
}
