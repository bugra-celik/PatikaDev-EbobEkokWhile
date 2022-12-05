import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2,ebob=1;
        int buyuk =0;

        Scanner scan = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz:");
        n1 = scan.nextInt();
        System.out.print("2.Sayıyı giriniz:");
        n2 = scan.nextInt();

       if(n1 > n2){
           buyuk = n1;
       }else{
           buyuk = n2;
       }
       while(buyuk >= 1){
           if(n1 % buyuk == 0 && n2 % buyuk == 0){
               ebob = buyuk;
               System.out.println("ebob:" +ebob);
               break;

           }
           buyuk--;
       }
       buyuk = 1;
       while(buyuk <= n1*n2){
           if(buyuk % n1 == 0 && buyuk % n2 == 0){
               System.out.println("ekok:" +buyuk);
               break;
           }
           buyuk++;
       }
    }
}
