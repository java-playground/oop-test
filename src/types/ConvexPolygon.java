package types;

public class ConvexPolygon {

    // array of names
    private String[] shapeNames = { null, null, null, "triangle", "quadrilateral", "pentagon", "hexagon", "heptagon", "octagon", "nonagon", "decagon"};

    /* number of sides */
    protected int numSides;

    /* constructor */
    public ConvexPolygon(int numSides) throws Exception {
        if(numSides < 3) throw new IllegalArgumentException();
        this.numSides = numSides;
    }

    /* get shape name */
    public String getShapeName() {
        if(this.getNumSides() >= 3 && this.getNumSides() <= this.shapeNames.length-1) {
            return this.shapeNames[this.getNumSides()];
        } else {
            // assuming that if sides are less than two, then illegal; therefore this polygon is larger than names array
            return "large polygon";
        }
    }

    /* get number of sides */
    public int getNumSides() {
        return this.numSides;
    }

    /* get sum of interior angles */
    public int getSumInteriorAngles() {
        return 180 * (this.numSides - 2);
    }

    /* get number of diagonals */
    public int getNumDiagonals() {
        return this.numSides * (this.numSides - 3) / 2;
    }

    /* print details */
    public void print() {
        System.out.format("This is a %s with %d sides, an interior angle sum of %d degrees, and %d diagonals.%n",
                this.getShapeName(),
                this.getNumSides(),
                this.getSumInteriorAngles(),
                this.getNumDiagonals());
    }

}
