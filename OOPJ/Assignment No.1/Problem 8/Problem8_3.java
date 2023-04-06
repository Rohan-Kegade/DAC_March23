// c. String instance into Byte instance.

class Problem8_3{
    public static void main(String []args)
    {
        String str = new String("10");
        byte b = Byte.valueOf(str);
        System.out.println(b);
    }
}