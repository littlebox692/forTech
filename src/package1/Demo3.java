package package1;

/**
 * Created by KelvinHuang on 18/1/14.
 */
public class Demo3 extends Demo6 {

	public void demo() {
		Demo5 demo5 = new Demo5();
		int bb = demo5.bb;
		System.out.print(aa);
		changeName();
	}

	public void changeName(){
		System.out.println("========");
	}

	@Override
	public void findBook() {

	}

}
