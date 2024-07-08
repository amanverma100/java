class Sib{
              private int a;
               void fun1()
               {
                 System.out.println("you can not access me directly");
               }
}

class Basic1{
    
    static void fun1()
    {
    System.out.println("hi");
    }
    static void fun2()
    {
     System.out.println("i am aman");
    }
      public static void main(String []arg)
     {
           fun1();
           Sib m1=new Sib();
           m1.fun1();
           fun2();
     }
}