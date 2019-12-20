package by.bntu.fitr.povt.patterns.factory.other.example.pizzaaf.reduced;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
 
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		cheese = ingredientFactory.createCheese();
	}
}
