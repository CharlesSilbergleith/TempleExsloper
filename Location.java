

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
    System.out.println("You Entered "+ this.name);
    float ran = (float) Math.random();
    if (ran == 0){
        enemy.attack(player);
        System.out.println(" You Encountered a "+ enemy.getName());
        System.out.println("You took "+ enemy.getAttack()+ " damage Your Health is at "+ player.health.getHealth());

    }else{
        System.out.println("You found a "+ enemy.getName());
        System.out.println("It Did Not Attack You");

    }
    System.out.println(" You found "+ loot +" gold and "+ item.toString());

    }
    public String getName(){
        return name;

    }
    public String getDescription(){
        return description;
    }
    
    
    public String getEnemy(){
        return enemy.getName();

    }
    public String getItem(){
        return item.getItem();

    }
   public int getLoot(){
        return loot;

   }
}
