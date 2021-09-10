package train.com.planets;

public class Earth  extends Planet implements PlanetAcceleration {

    @Override
    public double acceleration() {
        return 0;
    }
}
