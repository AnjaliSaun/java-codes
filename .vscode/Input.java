import java.util.Scanner;
class Input{
    public static void main(String args[]){
        Scanner  sc = new Scanner(System.in);
        int i,n;
        System.out.println("Enter no of element is array");
        n=sc.nextInt();
   int a[]=new int[n+1];
   for(i=0;i<n;i++){
    System.out.println("Enter element"+(i+1));
    a[i]=sc.nextInt();
   }
   System.out.println("Enter the position");
   int pos=sc.nextInt();
   for(i=pos-1;i<n;i++){
    a[i]=a[i+1];
   }
   for(i=0;i<n;i++){
    System.out.println(a[i]);
   }
    }
}
