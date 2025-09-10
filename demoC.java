class DemoC {
int a; int b;
DemoC() { this(1,2); }
DemoC(int a) { this(a, 0); }
DemoC(int a, int b) { this.a = a; this.b = b; }
void show() { System.out.println(a + "," + b); }
public static void main(String[] args) {
new DemoC().show();
new DemoC(5).show();
new DemoC(3,4).show();
}
}