public class HelloWorld {
	private int i;
	private String name;
	public HelloWorld() {
		// Hotfix
		System.out.println("Hallo.");
		i = 0;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}