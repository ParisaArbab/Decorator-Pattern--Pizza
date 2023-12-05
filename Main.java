// Concrete Pizza class
class BasicPizza extends Pizza {
    @Override
    public String display() {
        return "Pizza";
    }
}

// Abstract Decorator class
abstract class PizzaDecorator extends Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String display() {
        return pizza.display();
    }
}

// Olive topping decorator
class Olive extends PizzaDecorator {
    public Olive(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String display() {
        return super.display() + " with Olive";
    }
}

// Pepper topping decorator
class Pepper extends PizzaDecorator {
    public Pepper(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String display() {
        return super.display() + " with Pepper";
    }
}

// Mushroom topping decorator
class Mushroom extends PizzaDecorator {
    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String display() {
        return super.display() + " with Mushroom";
    }
}

// Main class to test the pattern
public class Main {
    public static void main(String[] args) {
        Pizza basicPizza = new BasicPizza();
        System.out.println(basicPizza.display());

        Pizza olivePizza = new Olive(basicPizza);
        System.out.println(olivePizza.display());

        Pizza pepperPizza = new Pepper(basicPizza);
        System.out.println(pepperPizza.display());

        Pizza mushroomPizza = new Mushroom(basicPizza);
        System.out.println(mushroomPizza.display());

        // You can also stack decorators
        Pizza fullyLoadedPizza = new Olive(new Pepper(new Mushroom(basicPizza)));
        System.out.println(fullyLoadedPizza.display());
    }
}
