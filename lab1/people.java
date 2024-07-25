import java.lang.*;
import java.util.*;
class People{
	public static void main(String[] args){
	int age;
	Scanner sc=new Scanner(System.in);
	age=sc.nextInt();
	// if(age<12) System.out.println("Child");
	// else if(age>12 && age<18) System.out.println("teenage");
	// else System.out.println("adult");
	age=((age)*(age+1))/2;
	System.out.print(age);
}
}