package train.com.planets;

public class Uranus extends Planet implements PlanetAcceleration {
    public Uranus() {
        r = 25559000;
        m = 8.6813*Math.pow(10,25);
    }

    @Override
    public double[] acceleration() {
        double num[] = AccelerationUtil.freeFallAcceleration(G, m,r);
        g = num[0];
        return num;
    }
}
