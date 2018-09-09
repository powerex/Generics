package metasymbol;

public class App {

    public static void main(String[] args) {



    }

    public static void showXY(Coords<?> c) {
        System.out.println("Координати X Y:");
        for (int i=0; i<c.getCoords().length; i++) {
            System.out.println(c.getCoords()[i].x + " " + c.getCoords()[i].y);
        }
        System.out.println();
    }

    public static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("Координати X Y Z:");
        for (int i=0; i<c.getCoords().length; i++) {
            System.out.println(c.getCoords()[i].x + " " + c.getCoords()[i].y + " " + c.getCoords()[i].z);
        }
        System.out.println();
    }

}
