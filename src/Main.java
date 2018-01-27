import types.*;

public class Main {

    public static void main(String[] args) throws Exception {

        for(int i = 3; i < 11; i++) {
            RegularPolygon regularPolygon = new RegularPolygon(i);
            regularPolygon.print();
        }
    }

}
