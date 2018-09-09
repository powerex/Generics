package metasymbol;

public class Coords<T extends TwoD> {

    private T[] coords;

    public Coords(T[] coords) {
        this.coords = coords;
    }

    public T[] getCoords() {
        return coords;
    }
}
