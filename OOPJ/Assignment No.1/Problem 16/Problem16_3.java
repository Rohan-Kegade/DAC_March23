// c. String instance into Integer instance.

class Problem16_3{
    public static void main(String[] args)
    {
        String str = new String("12");

        int n = Integer.valueOf(str);

        System.out.println(n);
    }
}