

//class to make the locations 
public class Location {
    String name;
    String description;
    Enemy enemy ;
    Item item ;
    int loot;
    //blank constructor 
    public Location(){
        this.name="name";
        this.description="description";
        this.enemy = new Enemy();
        this.item=new Item();
        this.loot=1;

    }
    // constructor for name, dis , enemy , item , loot(gold value)
    public Location(String name, String description, Enemy enemy, Item item , int loot){
    this.name=name;
    this.description=description;
    this.enemy=enemy;
    this.item=item;
    this.loot=loot;
    }
    // exsplor the region with random events

    //ended here add the string for damge and health left of player along with the rest of the code
   public void explore(Player player){
    float ran = (float) Math.random();
    if (ran == 0){
        enemy.attack(player);
    }

    }
}
