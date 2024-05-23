package StringLogics;

public class PrintNoOfVowels
{
    public static void main(String[] args)
    {
        String s1="srikanth.mallu  3@gmail.com";
        char[] c=s1.toCharArray();
        int vowel=0;
        String vowels=" ";
        for(int i=0;i<c.length;i++)
        {
            char ch=c[i];
            if((ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
            {
                vowel++;
                vowels=vowels+c[i];
            }
        }
        System.out.println("No Of Vowel is"+vowel);
        System.out.println("vowels is="+vowels);
    }
}
