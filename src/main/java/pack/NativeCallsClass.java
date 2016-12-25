package pack;

public class NativeCallsClass
{
    static
    {
        System.loadLibrary("megalib");
    }
public static void main(String[] args){
    System.out.println(printOne());
}
    native public static int printOne();
}