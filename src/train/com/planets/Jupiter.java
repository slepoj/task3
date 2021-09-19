package train.com.planets;

public class Jupiter extends Planet implements PlanetAcceleration {
    public Jupiter() {
        r = 71492000;
        m = 1.8986*Math.pow(10,27);
    }

    @Override
    public double[] acceleration() {
        double num[] = AccelerationUtil.freeFallAcceleration(G, m,r);
        g = num[0];
        return num;
    }
}
