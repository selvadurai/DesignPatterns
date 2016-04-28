package factory;

public abstract class Pizza {
  String     name;
  Sauce      sauce;
  Clam       clam;
  Dough      dough;
  Cheese     cheese;
  Veggies    veggies[];
  Pepperoni  pepperoni;
  
  abstract void prepare();
  
  void bake(){
	  System.out.println("Bake for 15 minutes at 350");
  }
  
  void cut(){
	  System.out.println("Cutting the pizza diaganly");
  }
  
  void box(){
	  System.out.println("Place pizza in offical PizzaStore box");
  }
  
  void setName(String name){
    this.name=name;
  }

  String getName(){
	  return name;
  }

  public String toString(){
	  return "";
  }

}
