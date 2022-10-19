package java10;
import static java.lang.System.out;
public class class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb bb = new Cbbb();
		bb.set_num(5, 10);
		bb.show();
		
	}
}

//hw10_1,繼承的練習
class Caaa
{
	public int num1;
	public int num2;	
}
//請於此處設計子類別Cbbb
class Cbbb extends Caaa{
	void set_num(int n, int m) {
		//將父類別成員設定
		num1 = n;
		num2 = m;
	}
	void show() {
		out.print(num1 + " " + num2);
	}
}