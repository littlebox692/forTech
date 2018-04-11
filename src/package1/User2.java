package package1;

/**
 * Created by KelvinHuang on 18/1/28.
 */
public class User2 {
	private String name;
	private int age;


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

	public User2() {
		super();

	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof User2)) return false;
		User2 user2 = (User2) o;
		if (getAge() != user2.getAge()) return false;
		return getName().equals(user2.getName());

	}

	@Override
	public int hashCode() {
		String a = "bb";
		String b = "aa";
		int result = getName().hashCode();
		result = 31 * result + getAge();
		return result;
	}

	@Override
	public String toString() {
		System.out.println("访问\t菜鸟教程!\t");
		return "User2{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
