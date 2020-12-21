public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius, String color) {
        super(radius, color);
    }


    @Override
    public int compareTo(ComparableCircle o) {
        return  (getColor().compareTo(o.getColor()));
    }
}
