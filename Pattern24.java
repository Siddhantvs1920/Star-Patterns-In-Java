package StarPattern;

public class Pattern24 {
    public static void main(String[] args) {


        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if ((i<=4&&j+i>=4&&j+i<=8)||(i>=4&&j-i>=-4&&j-i<=0))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
