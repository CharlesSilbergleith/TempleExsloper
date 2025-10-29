
//main part of the code everything will run here
import java.util.ArrayList;
import java.util.Scanner;

// Main class controls game setup and basic flow
public class Main {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("=======================================");
        System.out.println("🏝️  WELCOME TO THE LOST EXPLORER GAME!");
        System.out.println("Explore, survive, and find the treasure!");
        System.out.println("=======================================\n");

        Scanner scan = new Scanner(System.in);

        //  Create the player and their health component
        Player player = new Player("Explorer",20,30);
        System.out.println("Hello " + player.getName() + "! Your adventure begins now.\n");

        //  Create enemies (5)
        Enemy jaguar = new Enemy("Jaguar", 15);
        Enemy snake = new Enemy("Snake", 10);
        Enemy bandit = new Enemy("Bandit", 12);
        Enemy scorpion = new Enemy("Scorpion", 8);
        Enemy guardian = new Enemy("Ancient Guardian", 20);
        Enemy Troll = new Enemy("Troll", 5);

        //  Create items (9)
        Item medkit = new Item("Medkit", "Heals 30 HP", 30);
        Item smallMedkit = new Item("Small Medkit", "Heals 15 HP", 15);
        Item water = new Item("Water Bottle", "Restores 10 HP", 10);
        Item herb = new Item("Healing Herb", "Natural jungle remedy. Heals 5 HP", 5);
        Item fruit = new Item("Jungle Fruit", "Tasty and refreshing. Heals 8 HP", 8);
        Item bandage = new Item("Bandage", "Stops bleeding. Heals 10 HP", 10);
        Item potion = new Item("Mystic Potion", "Heals 25 HP", 25);
        Item roots = new Item("Medicinal Roots", "Heals 12 HP", 12);
        Item sacredWater = new Item("Sacred Water", "Heals 50 HP", 50);

        //  Create locations (6 total)

        Location jungle = new Location("Dense Jungle", "You push through vines and hear distant animal calls.", snake, fruit,(int)(Math.random() * ((500 - 10) + 1)) + 10);
        Location temple = new Location("Temple Ruins", "Ancient carvings glow faintly as you enter.", jaguar, bandage,(int)(Math.random() * ((500 - 10) + 1)) + 10);
        Location river = new Location("River Bank", "Cool water flows gently past your feet.", scorpion, water,(int)(Math.random() * ((500 - 10) + 1)) + 10);
        Location cave = new Location("Dark Cave", "It's cold and echoing... you sense danger.", bandit, herb,(int)(Math.random() * ((500 - 10) + 1)) + 10);
        Location bridge = new Location("Ancient Bridge", "A shaky old bridge crosses a deep chasm.", Troll, smallMedkit,(int)(Math.random() * ((500 - 10) + 1)) + 10);
        Location shrine = new Location("Hidden Shrine", "A peaceful glow surrounds you.", guardian, sacredWater,(int)(Math.random() * ((500 - 10) + 1)) + 10);


        // Store all locations in an ArrayList
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(jungle);
        locations.add(temple);
        locations.add(river);
        locations.add(cave);
        locations.add(bridge);
        locations.add(shrine);

        // Show the world setup
        System.out.println("Your journey will take you through " + locations.size() + " locations.\n");
        int rooms=locations.size();
        String quit="";
        while((player.health.getHealth()>0) && !quit.equals("yes") && rooms!=0){
            rooms--;
            int index = (int)(Math.random() * (((locations.size()-1) - 0) + 1)) + 0;
            locations.get(index).explore(player);
            
            locations.remove(index);

        }
        //fix the play window the exslpor works for all rooms, make it ask befor moveing on and then check if it can if it cant break 
        
    }
}

