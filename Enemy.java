public class Enemy {
    String name;
    float attackPower;
    //blank enemy 
    public Enemy(){
        name="Enemy";
        attackPower=1;
    }
    //enemy constructor to add a name and power/ attack dammage
    public Enemy(String name, float power){
        this.name=name;
        attackPower=power;
    }
    // hits player
    public void attack(Player player){
        player.health.takeDamage(attackPower);

    }
}
