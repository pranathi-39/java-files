public class calculator1 {
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}
class overloadingmethod{
    public static void main(String[] args){
 calculator1 cal=new calculator1();
 System.out.println("SUM of 5 and 2 is"+cal.add(5,2));
 System.out.println("SUM of 5 and 2 is"+cal.add(2.1,3.9));
 System.out.println("SUM of 5 and 2 is"+cal.add(5,2,10));
}
}
