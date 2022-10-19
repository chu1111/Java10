package java10;
import static java.lang.System.out;
public class class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb bb = new Cbbb(1,2);
		bb.show();
		
	}
}

//hw10_1,繼承的練習
class Caaa
{
	public int num1;
	public int num2;
	Caaa(){
		num1 = 1;
		num2 = 1;
	}
	Caaa(int a, int b){
		num1 = a;
		num2 = b;
	}
}
//請於此處設計子類別Cbbb
class Cbbb extends Caaa{
	Cbbb(int a, int b){
		//呼叫父類別建構子
		super(a, b);
	}
	void set_num(int n, int m) {
		//將父類別成員設定
		num1 = n;
		num2 = m;
	}
	void show() {
		out.print(num1 + " " + num2);
	}
}