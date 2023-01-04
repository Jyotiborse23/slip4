class Pizza {
	String name;
	String dough;
	String sauce;
	 
	void prepare() {
		System.out.println("Prepare " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		
	}
  
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
 
	void cut() {
		System.out.println("Cut the pizza into diagonal slices");
	}
  
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
 
	 String getName() {
		return name;
	}
}

class ChicagoStyleCheesePizza extends Pizza {

	ChicagoStyleCheesePizza() { 
	   name = "Chicago Style Deep Dish Cheese Pizza";
	   dough = "Extra Thick  Dough";
	   sauce = "Plum Tomato Sauce";
   }
}

class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() { 
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin  Dough";
		sauce = "Marinara Sauce";
	}
}


 abstract class PizzaStore {
 
	abstract Pizza createPizza();
 
	 Pizza orderPizza() {

		Pizza pizza = createPizza();
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}


 class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza() {
        	
        return new ChicagoStyleCheesePizza();
	}
}

 class NYPizzaStore extends PizzaStore {

	Pizza createPizza() {
		
		return new NYStyleCheesePizza();

	}
}
 
 class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza();
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza();
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		
	}
}