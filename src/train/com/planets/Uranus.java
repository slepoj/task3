package train.com.planets;

public class Uranus extends Planet implements PlanetAcceleration {

    @Override
    public double acceleration() {
        return 0;
    }
}
