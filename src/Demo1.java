/**
 * Created by KelvinHuang on 18/1/14.
 */
public class Demo1 {
	int memberVariable = 111;

	static int classVariable = 333;


	public static void main(String[] args) {
		final int aa = 99;
//		aa = 88;
		int bb = aa;

		int localVariable = 222;

		int a = 8;
		a = 89;

		float b = 0.955f;
		float v = a + b;
		System.out.println("====1====");
		System.out.print(a + b);
	}

	public static void member() {
		System.out.print(classVariable);
	}

	public void local(int k) {
//		int t = 9;
//		k = t
		++k;
		k = k +1;
		System.out.print("=====k====" + k);
	}


}
