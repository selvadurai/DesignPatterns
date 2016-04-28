package factory;

public class Tester {

	public static void main(String[] args) {
		NYPizzaStore  x= new NYPizzaStore();
		Pizza cheese = x.createPizza("cheese");
        cheese.prepare();
        System.out.println(cheese.cheese.getDescription());
        
	}

}
