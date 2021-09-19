package train.com.planets;

public class Saturn extends Planet implements PlanetAcceleration {
    public Saturn() {
        r = 60268000;
        m = 5.6846*Math.pow(10,26);
    }

    @Override
    public double[] acceleration() {
        double num[] = AccelerationUtil.freeFallAcceleration(G, m,r);
        g = num[0];
        return num;
    }
}
