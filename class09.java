package java10;
import static java.lang.System.out;
public class class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb bb = new Cbbb();
		//呼叫子類別
		bb.display();
		
	}
}

//hw10_5,簡單的繼承範例
class Caaa
{
	private int num;
	public Caaa() {}
	public Caaa(int n) {
		num = n;
	}
	public int get() {
		return num;
	}
	void display() {
		out.print("printed from Caaa class");
	}
}

class Cbbb extends Caaa{
	public Cbbb() {}
	public Cbbb(int n) {
		super(n);
	}

	public void show() {
		System.out.println("num="+get());
	}
	void display() {
		out.print("printed from Cbbb class");
	}
}