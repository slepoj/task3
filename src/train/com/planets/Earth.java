package train.com.planets;

public class Earth  extends Planet implements PlanetAcceleration {
    @Override
    public double acceleration() {
        r = 6371000;
        m = 5.9726* Math.pow(10,24);
        return AccelerationUtil.freeFallAcceleration(G,m,r);
    }
}
