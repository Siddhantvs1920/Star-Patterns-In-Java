package StarPattern;

public class Practice3 {
    public static void main(String[] args) {


        for (int i = 0; i < 14; i++)
        {
            for (int j = 0; j < 18; j++)
            {
                if ((i<4&&j+i>=3&&j-i<=5)||(i<4&&j+i>=11&&j-i<=13)||(i>3&&j-i>=-4&&j+i<=20))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
