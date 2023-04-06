// d. long value into binary, octal and hexadecimal string.

class Problem20_4{
    public static void main(String[] args)
    {
        long n = 120l;

        System.out.println("Binary: "+Long.toBinaryString(n));

        System.out.println("Octal: "+Long.toOctalString(n));

        System.out.println("Hexa Decimal: "+Long.toHexString(n));

    }
}