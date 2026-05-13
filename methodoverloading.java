class demo{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double n1,int n2){
        return n1+n2;
    }
}
public class methodoverloading {
    public static void main(String[]args){
        int num1=2;
        int num2=3;
        int num3=7;
        demo obj=new demo();
       int res= obj.add(num1,num2);
        System.out.println(res);
    }
}
