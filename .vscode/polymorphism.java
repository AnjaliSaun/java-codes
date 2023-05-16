class Student{
    void show(String a,int b){
    System.out.println("2");
    }
    void show(int a,String b){
        System.out.println("4");
        }
        public static void main(String args[]){
            Student s1=new Student();
            s1.show("anjali",12);
        }
}
