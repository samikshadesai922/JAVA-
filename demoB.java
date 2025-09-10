class DemoB {
int x; String y;
DemoB(int x, String y) { this.x = x; this.y = y; }
void show() { System.out.println(x + " " + y); }
public static void main(String[] args) { new DemoB(7, "Hi").show();
}
}