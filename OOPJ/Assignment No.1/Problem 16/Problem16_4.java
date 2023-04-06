// d. int value into binary, octal and hexadecimal string.

class Problem16_4{
    public static void main(String[] args)
    {
        int n = 120;

        System.out.println("Binary: "+Integer.toBinaryString(n));

        System.out.println("Octal: "+Integer.toOctalString(n));

        System.out.println("Hexa Decimal: "+Integer.toHexString(n));

    }
}