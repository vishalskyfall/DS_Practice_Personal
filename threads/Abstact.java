package threads;

abstract class dog {
	public abstract void bark();

	public void test() {
		System.out.println("test");
	}
}
interface dograce{
	void race();
}
class voice extends dog {

	@Override
	public void bark() {
		System.out.println("bark");
	}

}
class race implements dograce{

	@Override
	public void race() {
		System.out.println("labaradorrrrr");
		
	}
	
}
class test2 extends dog {
}

public class Abstact {
	public static void main(String[] args) {
		voice d = new voice();
		d.bark();
		test2 t = new test2();
		t.test();
		dograce dd = new race();
		dd.race();
	}
}
