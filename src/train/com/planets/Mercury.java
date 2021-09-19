package train.com.planets;

public class Mercury extends Planet implements PlanetAcceleration {
    public Mercury() {
        r = 2439700;
        m = 3.33022*Math.pow(10,23);
    }

    @Override
    public double[] acceleration() {
        double num[] = AccelerationUtil.freeFallAcceleration(G, m,r);
        g = num[0];
        return num;
    }
}
