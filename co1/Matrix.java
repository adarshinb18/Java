import java.util.*;
public class Matrix
{
  public static void main(String[] args)
  {
    int m,n,i,j;
    Scanner data=new Scanner(System.in);
    System.out.println("Enter No. of Rows :");
    m=data.nextInt();
    System.out.println("Enter No. of Columns :");
    n=data.nextInt();
     
    int a[][]=new int[m][n];
    int b[][]=new int[m][n];
    int c[][]=new int[m][n];
    

    
    System.out.println("Enter First Matrix.....");
    for(i=0;i<m;i++)
    {
       for(j=0;j<n;j++)
       {
            a[i][j]=data.nextInt();
       }
    }
    
    System.out.println("Enter Second Matrix.....");
    for(i=0;i<m;i++)
    {
       for(j=0;j<n;j++)
       {
            b[i][j]=data.nextInt();
       }
    }

    for(i=0;i<m;i++)
    {
       for(j=0;j<n;j++)
       {
           c[i][j]=a[i][j]+b[i][j];
       }
    }
    
    System.out.println("Matrix After Addition");
    System.out.println("-------------------------");
    for(i=0;i<m;i++)
    {
       for(j=0;j<n;j++)
       {
           System.out.print(c[i][j]+"    " );
       }
       System.out.println();
    }
  }
}




    
  
