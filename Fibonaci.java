package tuan1;
import java.util.Scanner;
public class Fibonaci {
  long f1(int n){
    if(n==1 || n==2){
      return 1;
    }
    return f1(n-1)+f1(n-2); 
  }
  public static void main(String []args){
    Scanner scanner=  new Scanner(System.in);
    int n;
    System.out.print("Nhap n=");
    n=scanner.nextInt();
    Fibonaci  f=new Fibonaci();
    for(int i=1;i<=n;i++){
    System.out.print(f.f1(i)+" ");
    }
  }
}