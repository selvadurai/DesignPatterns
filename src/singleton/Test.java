package singleton;

public class Test {

	public static void main(String[] args) {
		Singleton object=Singleton.getInstance();
		System.out.println(object.getMessage());
		object.setMessage("Oh Henry");
		System.out.println(object.getMessage());
	}

}
