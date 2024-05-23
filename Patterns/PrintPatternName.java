package Patterns;

public class PrintPatternName
{
    public static void main(String[] args)
    {
        //char[] letter={'S', 'R', 'I', 'K', 'A', 'N', 'T', 'H'};

        String s="SRIKANTH";
        char[] letter=s.toCharArray();

//        String l="12356345";
//        char[] letter=l.toCharArray();

        int size=letter.length;
        for(int i=0;i<size;i++)
        {
           for(int j=0;j<size-i-1;j++)
           {
               System.out.print(" ");
           }
           for(int k=0;k<=i;k++)
           {
               System.out.print(letter[i]+" "); //SRRIIIKKKKAAAAANNNNNNTTTTTTTHHHHHHHH
            //   System.out.println(letter[k]+" "); //SSRSRISRIKSRIKASRIKANSRIKANTSRIKANTH
           }
            System.out.println();
        }
    }
}
