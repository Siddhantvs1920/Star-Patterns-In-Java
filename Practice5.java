package StarPattern;

/*public class Practice5 {


}*/
public class Practice5
{
    public static void main(String[] args)
    {
//inheri.8
        Count2 count = new Count2();
        count.count();
    }
}
class Count extends Count2
{
    Count()
    {
    }
}
class Count2
{
    void count()
    {
        int i = 5;
        System.out.print("Output = ");
        for (int x = 0; x <= (i % 7); x += 1)
        {
            System.out.print(" " + x);
            i++;
        }
    }
}
