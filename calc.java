class Calc {
int add(int a, int b) { return a + b; }
int mul(int a, int b) { return a * b; }
public static void main(String[] args) {
Calc c = new Calc();
System.out.println(c.add(2,3));
System.out.println(c.mul(4,5));
}
}