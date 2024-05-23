package ConvertCharToInt;

public class DataTypeAssignValues
{
    public static void main(String[] args)
    {
        //Byte Stores whole numbers from -128 to 127  1 byte
        byte a=127;
        System.out.println(a);

        //Short Stores whole numbers from -32,768 to 32,767  2 byte
        short b=32334;
        System.out.println(b);

        //Int Stores whole numbers from -2,147,483,648 to 2,147,483,647  4 byte
        int c=23434222;
        System.out.println(c);

        //Long Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807  8 byte when we cross the more then 9 digits then we will give L
        long d=7782323454L;
        System.out.println(d);

        //Float Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits   4 byte
         float e=3778821.00f;
        System.out.println(e);

        //Double Stores fractional numbers. Sufficient for storing 15 decimal digits  8 bytes
          double f=77466722342234.00d;
         System.out.println(f);

        //Boolean Stores true or false values  1 bit
         Boolean g=true;
        System.out.println(g);

        //CharStores a single character/letter or ASCII values  2 byte
        char h='A';
        System.out.println(h);

    }
}
