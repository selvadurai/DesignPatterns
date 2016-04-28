package iterator;

public class MenuTestDriver {

	public static void main(String[] args) {
		DinnerHouseMenu dinnerMenu = new DinnerHouseMenu();
		Waiteress waitress = new Waiteress(dinnerMenu);
		waitress.PrintMenu();

	}

}
