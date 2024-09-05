package polymorphism;

public class Generics<V> {

    private V myValue;

    public Generics(V myValue) {
        this.myValue = myValue;
    }

    void printValue(){
        System.out.println(myValue + " String");
    }

    public static void main(String[] args) {

        Generics<String> myGeneric = new Generics("Temp");
        Generics<Integer> myGeneric0 = new Generics(0 );

        myGeneric.printValue();
        myGeneric0.printValue();

    }
}
