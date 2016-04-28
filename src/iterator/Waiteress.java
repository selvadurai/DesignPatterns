package iterator;

public class Waiteress {
    DinnerHouseMenu        dinnerMenu;
	
	public Waiteress(DinnerHouseMenu dinnerMenu) {
	   this.dinnerMenu = dinnerMenu;
	}
	
	public void PrintMenu(){
		Iterator dinnerIterator = dinnerMenu.createIterator();
		printMenu(dinnerIterator);
	}
	
	
	
	
	private void printMenu(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print(menuItem.getName() + ",  ");
			System.out.print(menuItem.getPrice() + ",  ");
			System.out.print(menuItem.getDescription() + ",  \n");
		}
	}

}
