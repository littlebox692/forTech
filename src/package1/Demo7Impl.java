package package1;

/**
 * Created by KelvinHuang on 18/1/14.
 */
public class Demo7Impl implements Demo7 {
	@Override
	public void findBook() {
		int content = 7;
		System.out.println("findBook by content" + content);
	}

	@Override
	public int findContentLength(int j) {
		return 0;
	}
}
