import java.util.Scanner;

class main06 {

    final static Scanner sc =new Scanner(System.in);
    public static void main(String[] args){
        int a=input_();
        int i=0;
        while(i<a){
        System.out.println("Hello World :: "+i);
        i++;
        }

        

    }

    public static int input_(){
        int b =sc.nextInt();
        return b;
    }


}