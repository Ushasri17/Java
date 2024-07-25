import java.util.Scanner;
class products{
  String name;
  double price;
  int quantity=0;
  public  products(String name,double price,int quantity)
  {
  this.name=name;
  this.price=price;
  this.quantity=quantity;
  }
  public String getName(){
  return name;
  }
  public double getPrice()
  {
   return price;
  }
  public int getQuantity()
  { 
   return quantity;
  }
}
class grocery{
 static int numProducts=0;
 static double totalRevenue=0;
 public static void addProduct(products p)
 {
  numProducts++;
 }
 public static void sellProduct(products p,int quantity)
 {
  if(p.getQuantity()>=quantity){
   p.quantity-=quantity;
   totalRevenue+=(p.getPrice()*quantity);
  }
  else{
   System.out.println("insuficient");
  }
 }
 public static void displayStatus()
 {
  System.out.println("no. of product:"+numProducts);
  System.out.println("total revenue:"+totalRevenue);
 }
}

class GroceryStore{
 public static void main(String args[])
 {
  //grocery g=new grocery();      
  Scanner sc=new Scanner(System.in);
  System.out.println("enter range:");
  int n=sc.nextInt();
  while(n!=0){
  System.out.println("enter name:");
  String s=sc.next();
  System.out.println("enter price:");
  double pr=sc.nextDouble();
  System.out.println("enter quantity:");
  int q=sc.nextInt();
  products p=new products(s,pr,q);
  grocery.addProduct(p);
  grocery.sellProduct(p,10);
  n--;
 }
 sc.close();
 grocery.displayStatus();
}
}