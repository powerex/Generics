package twotype;

public class TwoGen<T, V> {

    T objOne;
    V objTwo;

    public TwoGen(T objOne, V objTwo) {
        this.objOne = objOne;
        this.objTwo = objTwo;
    }

    public void showTypes() {
        System.out.println("Тип 1: " + objOne.getClass().getName());
        System.out.println("Тип 1: " + objTwo.getClass().getName());
    }

    public T getObjOne() {
        return objOne;
    }

    public V getObjTwo() {
        return objTwo;
    }

    public static void main(String[] args) {

        TwoGen<String, Double> obj = new TwoGen<String, Double>("Test", 12.0);

        obj.showTypes();

    }
}
