package train.com.planets;

public class Earth  extends Planet implements PlanetAcceleration {
    public Earth() {
        r = 6378100;
        m = 5.9726* Math.pow(10,24);
    }

    @Override
    public double[] acceleration() {
        double num[] = AccelerationUtil.freeFallAcceleration(G, m,r);
        g = num[0];
        return num;
    }
}
