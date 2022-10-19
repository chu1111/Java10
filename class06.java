package java10;
import static java.lang.System.out;
public class class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CData obj = new CData(3, 8);
		obj.area();
	}
}
class CTriangle{
	protected int base;
	protected int height;
	
	protected void show() {
		out.println("base=" + base + ", height=" + height);
	}
}
class CData extends CTriangle{
	CData(int n, int m){
		base = n;
		height = m;
	}
	void area() {
		super.show();
		out.println((float)base * height / 2);
	}
}