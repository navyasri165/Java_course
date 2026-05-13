class calculator{
    public int add(int n1,int n2){
        int res=n1+n2;
        return res;

    }
}
public class cla0bjex {
    public static void main(String[]args){
     int num1=7;
     int num2=7;
     calculator calc=new calculator();
     int res=calc.add( num1, num2);
        System.out.println(res);
    }
}
