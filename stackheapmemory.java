class demo{
    int num1=7;
    public int add(int n1,int n2){
        return n1+n2;
    }
}
public class stackheapmemory {
    public static void main(String[]args){
        int data=10;
        int n1=55;
        int n2=77;
        demo obj=new demo();
        demo obj1=new demo();
         int res=obj.add(n1,n2);
        System.out.println(res);
        System.out.println(obj1);

    }
}
