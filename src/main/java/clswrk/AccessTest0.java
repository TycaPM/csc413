package clswrk;

public class AccessTest0 {

    private int ivar;

    protected int jvar;

    public int kvar;

    int lvar;

    public static void main(String[] args) {

        AccessTest0 a = new AccessTest0();
        System.out.println(a.ivar);
        System.out.println(a.jvar);
        System.out.println(a.kvar);
        System.out.println(a.lvar);

    }
}
