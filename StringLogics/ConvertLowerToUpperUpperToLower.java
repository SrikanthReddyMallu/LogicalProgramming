package StringLogics;

public class ConvertLowerToUpperUpperToLower
{
    public static void main(String[] args)
    {
      String s1="Hi12@HElloBye";
      char[] c=s1.toCharArray();
      String s2=" ";
      for(int i=0;i<c.length;i++)
      {
          char ch=c[i];
          if(ch>='a' && ch<='z')
          {
              int a=(int)ch;
              int b=a-32;
              char c1=(char)b;
              s2=s2+c1;
          }
         else if(ch>='A' && ch<='Z')
          {
              int d=(int)ch;
              int e=d+32;
              char c2=(char)e;
              s2=s2+c2;
          }
         else
          {
              s2=s2+ch;
          }

      }
        System.out.println(s2);
    }
}
