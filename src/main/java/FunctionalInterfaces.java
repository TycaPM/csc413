interface MyInterface {

    Integer addIntegers(int a, int b);

}

interface NextInterface {

    public Void addIntegers(int a, int b);

}

public class FunctionalInterfaces {

    public static void main(String[] args) {

        MyInterface myLambda = (a,b) -> a + b;

        System.out.println(myLambda.addIntegers(1,2));

        NextInterface nextLambda = (a,b) -> {
            System.out.println(a);
            System.out.println(b);
            return null;
        };
        nextLambda.addIntegers(4,5);
    }
}
