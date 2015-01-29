package example1;

import javax.swing.JOptionPane;

/**
 * This class is an an abstraction of a real cake object. It demonstrates poor
 * encapsulation.
 * 
 * @author jlombardo
 */
public class Cake {
    private String cakeName;
    //// Both of these properties violate encapsulation rules. All should be
    // declared private scope and should have getter and/or setter methods.
    ///////

    // default scope -- visible only to classes in the same package
    int quantity;

    // protected scope -- visible to classes in the same package, or to
    // subclasses of this class in any package.
    protected int size;

    //// Some of the methods below violate encapsulation rules. Many should
    //   be private, those that have arguments (setters) need validation rules.
    ////////

    public void setCakeName(String name) {
        this.cakeName = name;
    }
    
    public int getQuantity() {
        return quantity;
    }

    // VERY BAD! quantity should be validated for legal range
    public void gatherIngredients(int quantity) {
        this.quantity = quantity;
        System.out.println("Ingredients gathered");
    }

    public void mixIngredients() {
        System.out.println("Ingredients mixed");
    }

    public void bake() {
        System.out.println("Baking...");
    }

    public void takeFromOvenAndLetCool() {
        System.out.println("All done baking, removed from oven, cooling...");
    }
}
