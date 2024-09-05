package csc413;

import clswrk.AccessTest0;

public class HelloWorld extends AccessTest0 {

    public static void main(String[] args) {

        AccessTest0 a = new AccessTest0();
        //System.out.println(a.ivar);
        //System.out.println(a.jvar);
        System.out.println(a.kvar); //Public var is only accessible var
        //System.out.println(a.lvar);

        HelloWorld b = new HelloWorld();
        System.out.println(b.jvar);
    }
}
