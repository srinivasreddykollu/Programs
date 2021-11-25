public class StringReverse {
    String rev="";
    public StringReverse(String str){
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            rev=ch[i]+rev;
        }
        System.out.println(rev);
    }
    public static void main(String[] args){
        StringReverse obj=new StringReverse("srinivas");
    }
}
