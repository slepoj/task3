package train.com.planets;

public class Neptune extends Planet implements PlanetAcceleration {
    public Neptune() {
        r = 24764000;
        m = 1.0243*Math.pow(10,26);
    }

    @Override
    public double[] acceleration() {
        double num[] = AccelerationUtil.freeFallAcceleration(G, m,r);
        g = num[0];
        return num;
    }
}
