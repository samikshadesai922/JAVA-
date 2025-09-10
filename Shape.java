public class AbstractClassesExample{
public static void main(String[] args){
Shape s = new Square();
s.printinfo();
s.draw();
}
}





abstract class Shape{
abstract void draw();
void printinfo(){
System.out.println("this is shape");
}
}
class Square extends Shape{
void draw(){

System.out.println("this is square");
}
}
