// c. String instance into long instance.

class Problem20_3{
    public static void main(String[] args)
    {
        String str = new String("12");

        long n = Long.valueOf(str);

        System.out.println(n);
    }
}