import java.lang.*;
import java.util.Scanner;
class hello
{
static void even(){
System.out.println("enter a value");
Scanner scan=new Scanner(System.in);
int num;
num=scan.nextInt();
if(num%2==0){
	System.out.println(num+"Even");
}
else System.out.println("odd");
}
static void prime(){
Scanner scan=new Scanner(System.in);
int pav;
pav=scan.nextInt();
int count=0;
for(int i=1;i<=pav;i++){
	if(pav%i==0){
		count=count+1;
	}
}
if(count==2) System.out.println("prime");
else System.out.println("not a prime");
}
static void greatestofthree(){
int a,b,c;
Scanner scan=new Scanner(System.in);
a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();
if(a>b && a>c) System.out.println(a+ "is greatest");
else if(b>a && b>c) System.out.println(b+"is greatest");
else System.out.println(c+"is greatest");
}
public static void main(String x[]){
System.out.print("Hello World");
even();
prime();
greatestofthree();
}
}





