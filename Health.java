public class Health {
    float currnet;
    float max;

    //basic constuctor for health = 10
    public  Health(){
        currnet=10;
        max= 10;
    }
    // constuctor that sets the values of max health and current health
    public Health(float currnet, float max){
        this.currnet=currnet;
        this.max= max;
    }
    //basic take dame that takes one from health
    public void takeDamage(){
        currnet-= 1;


    }

    //take damage but it sets it to the amount given by dev
    public void takeDamage(float amount){
        currnet-= amount;



    }

    //basic heal for one and if current is more then max it sets currnt to max
    public void heal(){
        currnet+= 1;
        if(currnet>max){
            currnet=max;

        }


    }
    //heals for an amount given and makes sure current doesnt go over max
    public void heal(float amount){
        currnet+= amount;
        if(currnet>max){
            currnet=max;

        }

    }
    //returns  the current health as string 
    public String toString(){
        return( ""+currnet);

    }
    public float getHealth(){
        return currnet;

    }
}
