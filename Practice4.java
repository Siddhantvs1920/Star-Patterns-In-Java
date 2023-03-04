package StarPattern;

public class Practice4 {
    public static void main(String[] args) {


        for (int i = 0; i < 14; i++)
        {
            for (int j = 0; j < 18; j++)
            {
                if (i>3&&j-i>=-4&&j+i<=20)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
