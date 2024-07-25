import java.util.*;
class Substring{
public static void main(String[] args){
System.out.println("enter a sentence:");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println("enter the sub string:");
String a=sc.nextLine();
String st="";
String at="";

int i,j=0,flag=0;
for(i=0;i<s.length();i++){
  if(s.charAt(i)!=32){ 
    st+=(char)s.charAt(i);
  }
}
for(i=0;i<a.length();i++){
  if(a.charAt(i)!=32){
    at+=(char)a.charAt(i);
  }
}
for(i=0;i<st.length();i++){
  if(st.charAt(i)==at.charAt(j)){
    for(i=1;i<st.length();i++){
      for(j=1;j<at.length();j++){
        if(at.charAt(j)!=st.charAt(i)){
          flag=1;
          break;
        }
      }
    }
  }
}
if(flag==1){
  System.out.println(a+"is the substring in "+s);
}
else{
  System.out.println(a+"is not substring in"+s);
}
  }
}