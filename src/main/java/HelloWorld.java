import java.awt.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class HelloWorld {

    public static void main(String[] args) {

        //var myInt = 123;
        //System.out.println(myInt);

        //Function
        Function<String, String> myLambda = input -> input + "?";
        System.out.println(myLambda.apply("How are you"));

        doStuff(a -> a + "!");

        //BiFunction
        BiFunction<String,Integer,String> asciiMaker = (text, count) -> {
            String output = "";
            for(int i = 0; i < count; i++){
                String line = "";
                for(int j = 0; j < i; j++){
                    line += "*";
                }
                output += line + text + "\n";
            }
            return output;
        };
        System.out.println(asciiMaker.apply("Hello", 10));

        //Predicate
        Predicate<Integer> intFilter = (myVal) -> myVal > 10;

        System.out.println(intFilter.test(9));
        System.out.println(intFilter.test(10));
        System.out.println(intFilter.test(11));

        doStuff(HelloWorld::doNextStuff);
        var hello = new HelloWorld();
        doStuff(hello::doNextStuff2);

    }

    static String doNextStuff(String input){
        return "*" + input + "*";
    }

    String doNextStuff2(String input){
        return "$" + input + "$";
    }

    static void doStuff(Function<String,String> myLambda){

        System.out.println(myLambda.apply("How are you"));

    }
}
