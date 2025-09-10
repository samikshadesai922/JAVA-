class OverloadAdd {
int add(int a,int b){return a+b;}
double add(double a,double b){return a+b;}
public static void main(String[] args){
OverloadAdd o=new OverloadAdd();
System.out.println(o.add(2,3));
System.out.println(o.add(2.5,3.5));
}
}