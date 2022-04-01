public class Product
{
   String pcode;
   String pname;
   int price;
      public Product(String pcode_get,String pname_get,int price_get)
      {
        pcode=pcode_get;
        pname=pname_get;
        price=price_get;
      }
      public int get_price()
      {
       return price;
      }
      public static void main(String[] args)
     {
       Product p1=new Product("A","tv",200);
       Product p2=new Product("B","radio",2100);
       Product p3=new Product("C","dvd",350);
       if(p1.price<=p3.price && p1.price<=p2.price)
       System.out.println("Lowest product ID :"+p1.pcode+" Price="+p1.price);
       if(p3.price<=p1.price && p3.price<=p2.price)
       System.out.println("Lowest product ID :"+p3.pcode+" Price="+p3.price);
       if(p2.price<=p3.price && p2.price<=p1.price)
       System.out.println("Lowest product ID :"+p2.pcode+" Price="+p2.price);   
     }
}   
       
