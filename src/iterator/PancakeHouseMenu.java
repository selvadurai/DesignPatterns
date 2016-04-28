package iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {
  ArrayList<MenuItem> menuItems;
	
  public PancakeHouseMenu(){
	  menuItems = new ArrayList<MenuItem>();
	  addItem("Blue Berry Pancakes", 
			  "Pancakes with Blue Berry ",
			   true,
			   7.9);
	  addItem("Choclate Pancakes", 
			  "Pancake with choclate chips ",
			   true,
			   1.9);
  }

  
  public void addItem(String name,String description, boolean vegetarian,double price){
	  MenuItem menuItem = new MenuItem(name, description, vegetarian,price);
      menuItems.add(menuItem);
  }

  public ArrayList<MenuItem> getMenuItems(){
	  return menuItems;
  }

}
