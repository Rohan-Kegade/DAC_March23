// Write a program to convert state of Byte instance into byte, short, int. long, float and double.

class Problem9_1{
    public static void main(String []args)
    {
        Byte obj = new Byte((byte)100);

        byte byteVal = obj.byteValue();
        System.out.println(byteVal);

        short shortVal = obj.shortValue();
        System.out.println(shortVal);

        int intVal = obj.intValue();
        System.out.println(intVal);

        long longVal = obj.longValue();
        System.out.println(longVal);

        float floatVal = obj.floatValue();
        System.out.println(floatVal);

        double doubleVal = obj.doubleValue();
        System.out.println(doubleVal);
    }
}