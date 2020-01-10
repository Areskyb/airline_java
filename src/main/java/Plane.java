public class Plane {
    private PlaneType type;

    public Plane(PlaneType type) {
        this.type = type;
    }


    public int getCapacity() {
        return this.type.getCapacity();
    }

    public double getWeight() {
        return this.type.getWeight();
    }
}
