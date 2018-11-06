package org.andestech.learning.rfb18.g2;


import java.util.Arrays;
import java.util.Locale;

public class App
{
    private static String getDomain(String email)
    {
      return email.substring(email.indexOf("@")+1);

    }


    public static void main( String[] args )
    {

      String name1 = "Peter";

      String name2 = new String("Peter");

        System.out.println( name1.hashCode()  );
        System.out.println( name2.hashCode()  );
        System.out.println(System.identityHashCode(name1));
        System.out.println(System.identityHashCode(name2));

      if(name1 == name2) System.out.println("1. equals!!"); // wrong way

      if(name1.equals(name2)) System.out.println("2. equals!!"); //ok
      if(name1.compareTo(name2) == 0)  System.out.println("3. equals!!");

      //...............

      String data = "123;45,A,BC _&7&+aghgh;ghд,лод;лодл;ЦЦ=;==";
      String login = "  BaSIL ";

        System.out.println(data.substring(5,7));
        System.out.println(data.charAt(14));
        System.out.println(login.trim().toUpperCase());

        System.out.println(Arrays.toString(data.split(";|,")));
        System.out.println(Arrays.toString(data.split("[;,]")));

        String val = new String("12345.0001239");
        double m=0;

        m = Double.parseDouble(val);
        int a2 = Integer.parseInt("1234");


        double res = 0.1*m;
        System.out.println("res1=" + res);

        System.out.printf("res2=%-10.2f, a2=%7x\n",res, a2);

        String resString = String.format(new Locale("ru"),
                "res2=%-10.3f, a2=%7x\n",res, a2);
        System.out.println( resString);

        char[] charr2 = resString.toCharArray();
        char key = 1800;
        //
        for(int i=0; i<charr2.length; i++ ) charr2[i] ^= key;

      System.out.println(new String(charr2));

      for(int i=0; i<charr2.length; i++ ) charr2[i] ^= key;
      System.out.println(new String(charr2));

      String email = "aa222@omsk.rfb.ru";

      String mask = "^.+@([a-zA-Z0-9]+\\.)*rfb\\.ru$";

      System.out.println( email.matches(mask) );


      System.out.println(email.contains("aa"));

      if(email.indexOf("omsk")!=-1) System.out.println("substring 'omsk' found!..");

      System.out.println(getDomain(email));


      //----------------------------------------------

      String container = "";
      for(int i = 0; i<30; i++)
      {
         container += ""+(char)(65+i);

      }

      System.out.println(container);


      StringBuilder container2 = new StringBuilder();
      for(int i = 0; i<30; i++)
      {
        container2.append(""+(char)(65+i));

      }

      System.out.println(container2);

    }
}
