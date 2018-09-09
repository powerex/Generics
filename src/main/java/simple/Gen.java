package simple;

public class Gen<T> {

    private T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

    public void showType() {
        System.out.println("Тип даних " + obj.getClass().getName());
    }

    public T getObj() {
        return obj;
    }

    public static void main(String[] args) {
        Gen<Integer> integerGen = new Gen<Integer>(100);
        integerGen.showType();
        System.out.println(integerGen.getObj());

        Gen<String> stringGen = new Gen<String>("Test");
        stringGen.showType();
        System.out.println(stringGen.getObj());
    }
}
