package package1;

import package2.Demo4;

import java.util.ArrayList;

/**
 * Created by KelvinHuang on 18/1/14.
 */
public class User {
	private String name;
	private int age;
	private String email;
	public static int age2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge2() {
		return age2;
	}

	@Override
	public int hashCode() {

		return getName().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("=============" + new User2());
		User objUser = (User)obj;
		User aa = new User();
		Object a = aa;
		User bb = (User)a;
		if (this.name == objUser.name) {
			return true;
		}else {
			return false;
		}
	}
}
