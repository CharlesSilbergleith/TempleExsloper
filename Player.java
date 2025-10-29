import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    Health health;
    List<Item> inventory = new ArrayList<>();
    int gold=0;
    

    /*
     * make all the diffrent construcuters 
     * the basic sets everying to a strating value
     * the secound is jsut for health
     * the third is for both that need to be changed 
     * gold will always start at zero
    */
    public Player(){
        name = "Player";
        health = new Health();
        

    }
    public Player(float startingHealth,float MaxHealth){
        name = "Player";
        health = new Health(startingHealth,MaxHealth);
        

    }
    public Player(String name, float startingHealth,float MaxHealth){
        this.name = name;
        health = new Health(startingHealth,MaxHealth);
        

    }
    //prints the stats to the screen
    public void showStats(){
        System.out.println("Current Health is at "+ health.toString()+"\nyour gold is at "+gold);
        System.out.println();
        if (inventory!=null){
        for (Item item: inventory){
            System.out.print(item.toString()+", ");
        }
        //of the invintro is empty it should give back null so it will then said there is nothing in there
    }else{
        System.out.print("nothing in invintory");

    }

    }
    //this adds and item to the list of items
    public void addItem(Item Item){
        inventory.add(Item);
        

    }
    public String getName(){
        return name;

    }
   
    
}
