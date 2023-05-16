
class boxes{
    int length;
    int breadth;
    int height;
    public void setdata(int x,int y,int z){
        length=x;
        breadth=y;
        height=z;
    }
    public void showdata(){
        System.out.println("length is"+length);
        System.out.println("breadth is"+breadth);
        System.out.println("height is"+height);
    }
}
    class Cubebox{
    public static void main(String args[]){
        boxes b1=new boxes();
        b1.setdata(10,20,30);
        b1.showdata();
        boxes b2=new boxes();
        b2.setdata(20,70,40);
        b2.showdata();
        boxes b3=new boxes();
        b3.setdata(88,44,55);
        b3.showdata();
    }
}
