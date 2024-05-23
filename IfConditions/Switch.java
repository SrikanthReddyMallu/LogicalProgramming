package IfConditions;

public class Switch
{
    public static void main(String[] args)
    {
        int marks=70;
        switch (marks)
        {
            case 30:
                System.out.println("Topper");
                break;
            case 80:
                System.out.println("Average");
                break;
            case 70:
                System.out.println("Poor");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
