package iterator;

import java.util.ArrayList;

public class DinnerHouseMenu {
  ArrayList<MenuItem> menuItems;
	
  public DinnerHouseMenu(){
	  menuItems = new ArrayList<MenuItem>();
	  addItem("T Special", 
			  "Fried Chicken with fries on the side ",
			   true,
			   17.9);
	  addItem("Hamburger", 
			  "Hamburger with fries on the side ",
			   false,
			   21.9);
  }

  
  public void addItem(String name,String description, boolean vegetarian,double price){
	  MenuItem menuItem = new MenuItem(name, description, vegetarian,price);
      menuItems.add(menuItem);
  }

  public ArrayList<MenuItem> getMenuItems(){
	  return menuItems;
  }

  public Iterator createIterator(){
	  return new DinerMenuIterator(menuItems);
  }
  
  
}

