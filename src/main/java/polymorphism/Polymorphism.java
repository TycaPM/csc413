package polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        Polymorphism p = new Polymorphism();
        p.doStuff(1);
        p.doStuff("1");
    }

    void doStuff(String a) {
        System.out.println(a + "!");
    }

    void doStuff(Integer a){
        System.out.println(a * 2);
    }

}
