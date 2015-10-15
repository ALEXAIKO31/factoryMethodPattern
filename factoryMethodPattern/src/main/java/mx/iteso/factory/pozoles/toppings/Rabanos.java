package mx.iteso.factory.pozoles.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.ToppingsDecorator;

/**
 * Created by ALEX on 14/10/2015.
 */
public class Rabanos extends ToppingsDecorator {
    Pozole pozole;

    public Rabanos (Pozole pozole){
        this.pozole = pozole;
    }

    @Override
    public void prepare(){
        pozole.serve();
        System.out.println("    rabanos");
    }

    @Override
    public String getName(){
        return pozole.getName() + " con rabanos";
    }
}
