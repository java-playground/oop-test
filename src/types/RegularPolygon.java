package types;

public class RegularPolygon extends ConvexPolygon {

    /* constructor */
    public RegularPolygon(int numSides) throws Exception {
        super(numSides);
    }

    /* calculate angle measure of any angle */
    public double getInteriorAngleMeasure() {
        return (double) this.getSumInteriorAngles() / this.getNumSides();
    }

    /* print extra properties */
    public void print() {
        super.print();
        System.out.format("It is a regular polygon with %.2f degrees per angle.%n%n", this.getInteriorAngleMeasure());
    }

}
