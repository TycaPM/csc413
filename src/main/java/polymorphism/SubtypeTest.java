package polymorphism;

class MyClassA{
    void doStuff0(){
        System.out.println("Output from A");
    }
}

class MyClassB extends MyClassA{
    void doStuff1(){
        System.out.println("Output from B");
    }
}

class MyClassC extends MyClassB{

}

public class SubtypeTest {

    public static void main(String[] args) {
        MyClassA a = new MyClassA();
        MyClassB b = new MyClassB();
        MyClassC c = new MyClassC();
        doStuff0(a);
        doStuff0(b);
        doStuff0(c);

        //doStuff1(a);
        doStuff1(b);
        doStuff1(c);

    }

    static void doStuff0(MyClassA myClassA){
        myClassA.doStuff0();
    }

    static void doStuff1(MyClassB myClassB){
        myClassB.doStuff1();
    }
}
