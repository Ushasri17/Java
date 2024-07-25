import java.util.*;
class VowelConsonant {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string");
        String a=sc.nextLine();
        int vowel=0,consonant=0,digit=0,word=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=65 && a.charAt(i)<=90 || a.charAt(i)>=97 && a.charAt(i)<=122){
            if(a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I' || a.charAt(i)=='O' || a.charAt(i)=='U' || a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
                vowel++;
            } 
            else consonant++;
        }
        if(a.charAt(i)>=47 && a.charAt(i)<=58){
            digit++;
           }
           if(a.charAt(i)==32) word++;
        }
     System.out.print("The no of vowels are "+vowel+" consonants are "+consonant+" digits are "+digit+" Words are "+(word+1));
}
}
