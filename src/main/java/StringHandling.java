public class StringHandling
{
    public static void main(String[] args)
    {
        String s1="Hello";
        String s2="Hello";
        String s3;
        s3=s1;
        String s4 = new String("Hello");
        if(s1==s2)
        {
            System.out.println("s1==s2");
        }
        else
        {
            System.out.println("s1!=s2");
        }
        if(s1==s3)
        {
            System.out.println("s1==s3");
        }
        else
        {
            System.out.println("s1!=s3");
        }
        if(s1==s4)
        {
            System.out.println("s1==s4");
        }
        else
        {
            System.out.println("s1!=s4");
        }
        System.out.println(s1);
        s1.toLowerCase();
        System.out.println(s1);
        s1=s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(3));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.concat("world"));
        System.out.println(s1.endsWith("takashi"));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.contains("l"));
        System.out.println(s1.isEmpty());
        System.out.println("------------------------------------------");
        String collegeName="Lambton college in Toronto";
        System.out.println(collegeName.length());
        System.out.println(collegeName.contains("world"));
        System.out.println(collegeName.contains("college"));
        System.out.println(collegeName.indexOf("Toronto"));
        System.out.println(collegeName.toUpperCase());
        System.out.println(collegeName.toLowerCase());
        System.out.println(collegeName.indexOf(10));
        System.out.println(collegeName.replace("Toronto", "New york"));
        System.out.println(collegeName.contains("lege"));
        System.out.println(collegeName.toCharArray());
        System.out.println(collegeName.concat("265 yorkland blvd., North york"));
        int a[]={1,2,3,4,5};
        int b[]=new int[]{6,7,8,9,10};
        int c[]= new int[20];
        char ch[]=collegeName.toCharArray();

        for(int i=0;i<ch.length;i++)
        {
            System.out.println(ch[i]);
        }

        char[]   r=new char[ch.length];
        int cnt=0;

        for(int j=ch.length-1;j>=0;j--)
        {
            r[cnt++]=ch[j];
            System.out.println(ch[j]);
        }
        System.out.println(r);




    }
}
