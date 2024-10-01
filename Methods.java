public class Methods
{
    public static void main(String[] args)
{
    mul(3,3);
    div(10,2);
    sub(30,5);
    factors(10);
    factors(15);
    factors(25);


   }
 public static void mul(int num1,int num2)
 {
       System.out.println(num1*num2);
 }
 public static void div(int num1,int num2)
 {
     
      if(num2 != 0)
      {

          int res = num1/num2;
          System.out.println(res);
      }
      else{
            System.out.println("num2 cannot be zero");
      }
      
 }
 public static void sub(int num1,int num2)
 {
      System.out.println(num1-num2);
 }
 public static void factors(int num)
 {
      System.out.println("factors of "+num+" are");
      for(int i = 1;i<=num;i++)
      {
            if(num%i==0)
            {
                  System.out.println(i);
            }
      }
 }
}