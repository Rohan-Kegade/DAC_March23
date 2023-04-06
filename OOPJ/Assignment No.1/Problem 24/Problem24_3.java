// c. String instance into float instance.

class Problem24_3{
    public static void main(String[] args)
    {
        String str = new String("12");

        float n = Float.valueOf(str);

        System.out.println(n);
    }
}