import java.util.Scanner;

public class Player {
    String name;
    int strength;
    int agility;
    int dexterity;
    int intelligence;

    public Player(String name) {
        this.name = name;
        strength = createAttribute();
        agility = createAttribute();
        dexterity = createAttribute();
        intelligence = createAttribute();
    }

    public int createAttribute() {
        int zari = (int) (Math.random() * 6) + 1;
        int zari2 = (int) (Math.random() * 6) + 1;
        int zari3 = (int) (Math.random() * 6) + 1;

        int min = Math.min(zari, Math.min(zari2, zari3));
        return zari + zari2 + zari3 - min;
    }

    public void printStats() {
        System.out.println("\n--- Player Stats ---");
        System.out.println("Name: " + name);
        System.out.println("Strength: " + strength);
        System.out.println("Agility: " + agility);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);

        int max_value = Math.max(Math.max(strength, agility), Math.max(intelligence, dexterity));
        System.out.println("\n--- Suggested Class ---");
        if (strength == max_value) {
            System.out.println("Barbarian!");
        }
        if (agility == max_value) {
            System.out.println("Assassin!");
        }
        if (intelligence == max_value) {
            System.out.println("Mage!");
        }
        if (dexterity == max_value) {
            System.out.println("Tank!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CREATE YOUR PLAYER:");
        System.out.print("PLAYER'S NAME: ");
        String name = input.next();

        Player player1 = new Player(name);
        player1.printStats();

        input.close();
    }
}
