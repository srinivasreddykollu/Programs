package Kollu;
 class Constructor {
        int num1;
        int num2;
     public static void main(String[] args) {
      Constructor demo= new Constructor();
        System.out.println("hello");
    }
    public  Constructor(){
        int num1=5;
        System.out.println("constructor is invoked");
    }
    public  Constructor(int n){
        int num2 = n;
        System.out.println(num2);
    }
}
