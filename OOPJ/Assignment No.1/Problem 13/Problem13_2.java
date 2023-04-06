// b. short value into Short instance.

class Problem13_2{
    public static void main(String[] args)
    {
        short s = 100;

        Short s1 = Short.valueOf(s);

        System.out.println(s1);
    }
}