public enum PlaneType {
    BOEING747(100,10000),
    CESNA778(4,1000),
    AEROLIGHT(2,600);

    private final int capacity;
    private final double weight;

    PlaneType(int capacity, double weight) {
    this.capacity = capacity;
    this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }
}
