package by.bntu.fitr.povt.patterns.factory.other.example.pizzaaf.reduced;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Cheese createCheese() {
		return new ReggianoCheese();
	}

}
