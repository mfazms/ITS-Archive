public class Human {
    
    private String name;
    private int hitPoints;
    private int baseAttack;
    private int level;

    public Human(String name) {
        this.name = name;
        this.hitPoints = 100;
        this.baseAttack = 10;
        this.level = 1;
    }

    public int attack() {
        return baseAttack * level;
    }

    public void attacked(int damage) {
        hitPoints -= damage;
    }

    public void levelUp() {
        level++;
        System.out.println(name + " reached level " + level);
    }

    public boolean isDead() {
        return hitPoints <= 0;
    }
    public void checkStatus() {
        System.out.println(name + "'s Status:");
        System.out.println("Level: " + level);
        System.out.println("HP: " + hitPoints);
        System.out.println("Attack: " + baseAttack);
        System.out.println();
    }
}