package factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clam createClam() {
		return new FreshClams();
	}

	@Override
	public Veggies[] createVeggies() {
	    Veggies veggies[] ={new Garlic(),new Onions(), new Pepper()};
		return veggies;
	}

	

}
