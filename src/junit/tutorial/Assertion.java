package junit.tutorial;

public class Assertion {
	public boolean timeOut = false;

	public void invoke(Runnable logic) {
		if(!timeOut) {
			logic.run();
		} else {
			throw new IllegalStateException();
		}
	}
}
