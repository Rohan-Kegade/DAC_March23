// c. String instance into Short instance.

class Problem13_3{
    public static void main(String[] args)
    {
        String str = new String("12");

        Short s = Short.valueOf(str);

        System.out.println(s);
    }
}