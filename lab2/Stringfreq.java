import java.util.*;
class Stringfreq{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string");
        String arr=sc.next();
        char[] a=arr.toCharArray();
        int count=0;
        char freq[]=new char[256];
        for(int i=0;i<arr.length();i++){
            freq[(int)a[i]]++;   
        } 
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0) System.out.println("the frequency of "+(char)i+" is"+(int)freq[i]);
        } 
    }
    }