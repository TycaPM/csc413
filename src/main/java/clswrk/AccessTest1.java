package clswrk;

public class AccessTest1 {

    public static void main(String[] args) {

        AccessTest0 a = new AccessTest0();
        //System.out.println(a.ivar); [Perms inadequate - must be same class]
        System.out.println(a.jvar);
        System.out.println(a.kvar);
        System.out.println(a.lvar);

    }
}
