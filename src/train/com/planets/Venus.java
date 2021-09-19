package train.com.planets;

public class Venus extends Planet implements PlanetAcceleration {
    public Venus() {
        r = 6051800;
        m = 4.8675*Math.pow(10,24);
    }

    @Override
    public double[] acceleration() {
        double num[] = AccelerationUtil.freeFallAcceleration(G, m,r);
        g = num[0];
        return num;
    }
}
