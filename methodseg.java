class computer{
    String pen;
    String res;
    String notthing;
   public int add(int n1,int n2){
   int res=n1+n2;
   return res;
    }
    public String getmeapen(int cost){
       if(cost>=10)
       return pen;

       return pen;


    }
}
public class methodseg {
    public static void main(String[]args){
        int num1=6;
        int num2=4;
        computer com=new computer();
         int res=com.add(num1,num2);
        String str= com.getmeapen(28);
        System.out.println(res);
        System.out.println(str);


    }
}
