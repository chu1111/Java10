package java10;
import static java.lang.System.out;
public class class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb bb = new Cbbb(2);
		bb.show();
		
	}
}

//hw10_5,簡單的繼承範例
class Caaa
{
	private int num;
	public Caaa(int n) {
		num = n;
	}
	public int get() {
		return num;
	}
}

class Cbbb extends Caaa{
	public Cbbb(int n) {
		super(n);
	}

	public void show() {
		System.out.println("num="+get());
	}
}
