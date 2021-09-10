package train.com.planets;

public class Venus extends Planet implements PlanetAcceleration {

    @Override
    public double acceleration() {
        return 0;
    }
}
