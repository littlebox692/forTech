package package2;

import package1.Demo3;
import package1.User;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.regex.Pattern;

/**
 * Created by KelvinHuang on 18/1/14.
 */
public class Demo4 {
	int a = 0;
	public Demo4() {
		a = 899;
	}

	public Demo4(int k) {
		String aa = "dd";
		String bb = new String("dd");
		System.out.print("running demo5...");
	}

	public void method1() {

	}

	public void method1(int age, String name) {

	}




	public static void main(String[] args) {
		String aa = new String("aa");
		aa.hashCode();
		User[] users = {new User(), new User()};
		User[] users2 = {new User(), new User()};
		users.equals(users2);



		String bb = new String("AA");
		int ai = 1;
		int bi = 1;
		System.out.println(ai == bi);
		System.out.println(aa == bb);


		User user1 = new User();
		user1.equals(user1);

		user1.setName("aa");
		User user2 = new User();


		Demo4 demo3 = new Demo4();
		user2.setName("aa");
		user1.equals(demo3);

		System.out.println(user1.hashCode() == user2.hashCode());







	}
}
