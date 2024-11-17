package Exercises2;

public class EjAv2
{
    public static void main(String[] args)
    {
        float a = 0.8f;
        int b = 3;
        char c = '5';
        int resint;
        double resdouble;

        resint = (int) (a - b + c);
        resdouble = (a - b * c);
        System.out.println("a + b + c="+ (a + b + c)+"resint = " + resint + "resdouble =" + resdouble);
        resint = (int)(a - b + c);
        resdouble = (double)(a - b + c);
        System.out.println(a - b + c);
    }
}