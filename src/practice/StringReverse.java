package practice;

public class StringReverse {
    public static void main(String[] args){
        String rev="";
        String str="tit";
       /* int len=str.length();
        System.out.println(len);
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);*/
      char ch[]=str.toCharArray();
        System.out.println(ch);
        for(int i=ch.length-1;i>=0;i--){
           rev=rev+ch[i];
        }
        System.out.println(rev);
        if(str.equalsIgnoreCase(rev)){
            System.out.println("the given string is palindrome");
        }
        else {
            System.out.println("the given string is not a palindrome");
        }

    }
}
