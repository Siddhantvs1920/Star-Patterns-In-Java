package StarPattern;

public class PracticeHacker {
    public static void main(String[] args) {
        String Sm="Gre5ks for Greek4s";
        String[] s=Sm.split(" ");
        String s1="";
        for(int i=s.length-1;i>=0;i--)
        {
            if(i>0)
                s1=s1+s[i]+" ";
            else
                s1+=s[i];
        }
        System.out.println(s1);
        String s2="";
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch>='0'&&ch<='9')
            {
                int num=(int)(ch-48);
                for(int j=0;j<num-1;j++)
                    s2=s2+s1.charAt(i-1);
            }
            else
                s2+=ch;
        }
        System.out.println(s2);

    }
}
