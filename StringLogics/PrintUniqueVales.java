package StringLogics;

public class PrintUniqueVales
{
    public static void main(String[] args) {
        String s1 = "hello hii how are you";
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s1.toCharArray();
        String s2 = " ";
        for (int i = 0; i < arr1.length;i++)
        {
            int c=0;
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j] && arr1[i]!=' ')
                {
                    arr2[j]='0';
                    c++;
                }
            }
            if(c==1 || arr1[i]==' ')
            {
                s2=s2+arr1[i];
            }
        }
        System.out.println(s2);
    }
}
