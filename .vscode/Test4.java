import java.util.Scanner;
class anjali{
    public static void main(String args[]){
        Scanner  sc = new Scanner(System.in);
        int i,j,n,count=0,zero=0,pcount=0,ncount=0;
        System.out.println("Enter no of element is array");
        n=sc.nextInt();
   int a[]=new int[n+1];
   for(i=0;i<n;i++){
    System.out.println("Enter element"+(i+1));
    a[i]=sc.nextInt();
   }
   for(i=0;i<a.length;i++){
    if(a[i]>0){
        pcount+=1;
    }
    else if(a[i]==0){
        zero+=1;
    }
    else{
        ncount+=1;
    }
   }
   System.out.println("Positive no count is:"+pcount);
   System.out.println("Negative no count is:"+ncount);
}
}
  
