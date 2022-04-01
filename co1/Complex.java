import java.util.*;
public class Complex
{
  public static void main(String[] args)
  {
    int a,b,c,d,real,img;
    Scanner data=new Scanner(System.in);
    System.out.println("Enter the real part of First Complex number: ");
    a=data.nextInt();
    System.out.println("Enter the imaginary part of First Complex number: ");
    b=data.nextInt();

    System.out.println("Enter the real part of second Complex number: ");
    c=data.nextInt();
    System.out.println("Enter the imaginary part of second Complex number: ");
    d=data.nextInt();

     real=a+c;
     img=b+d;
     System.out.println("sum of complex number :");
     System.out.println(real+" + "+img+"i");
   }
}
