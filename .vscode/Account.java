import java.util.Scanner;
class Account{
    String name;
    int Accno;
    int year ;
    int principal;
    static double roi=10.5;
    double total;
    public void setdata(){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter account number:");
       int x=sc.nextInt();
       System.out.println("Enter principal amount:");
       int y=sc.nextInt();
       System.out.println("Enter years");
       int z=sc.nextInt();
       System.out.println("Enter account holder name");
       String n=sc.nextLine();
        Accno=x;
        principal=y;
        year=z;
        name=n;
        total=principal+(principal*roi*year)/100;
    }
    public void showdata(){
        System.out.println("Account number is"+Accno);
        System.out.println("principal is"+principal);
        System.out.println("time duration is"+year);
        System.out.println("Account holder name is"+name);
        System.out.println("Interest is"+total);
    }
}
    class bankacc{
    public static void main(String args[]){
       Account a1=new Account();
       a1.setdata();
       a1.showdata();
    }
}

