package factory;

public class NYPizzaStore extends PizzaStore {
	
	
	@Override
	Pizza createPizza(String item) {
		Pizza pizza=null;
		
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(item.equals("cheese")){
			pizza=new CheesePizza(ingredientFactory );
			pizza.setName("New york style cheese pizza");
		
		} else if(item.equals("veggie")){
			pizza= new VeggiePizza(ingredientFactory);
			pizza.setName("New york style veggie pizza");
		} else if(item.equals("clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York clam pizza");
		} else if(item.equals("pepperoni")){
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Pepperoni Pizza");
		}
		
		return pizza;
	}

}
