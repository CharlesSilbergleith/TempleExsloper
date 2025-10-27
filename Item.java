

// to hold items
public class Item {
    String name;
    String description;
    float healAmount;
    //blank constructor 
    public Item(){
        name="Item";
        healAmount = 1;
        description =" heals for "+ healAmount;

    }
    //added constructor so dev can adjust what values for the vars
    public Item(String name, float amount, String description ){
        this.name=name;
        this.healAmount = amount;
        this.description = description;

    }
    //uses the healing item
    public void use(Player player){
        player.health.heal(healAmount);
    }
    //returs the name of item and the description as a string 
    public String toString(){
        return (name+": "+description);

    }
}
