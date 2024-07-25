import java.util.*;
public class VowelException extends Exception{
    VowelException(String s){
        super(s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int vowel=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I' || a.charAt(i)=='O' || a.charAt(i)=='U' || a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
               vowel++;
            }
        }
        try{
           if(vowel==0) throw new VowelException("your string has no vowels");
           else System.out.println("your string has vowels");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
}
}

