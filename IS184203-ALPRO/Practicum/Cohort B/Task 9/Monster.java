public class Monster {
    
    private String name;
    private int hitPoints;
    private int baseAttack;

    public Monster(String name) {
        this.name = name;
        this.hitPoints = 40;
        this.baseAttack = 5;
    }

    public int attack() {
        return baseAttack;
    }

    public void attacked(int damage) {
        hitPoints -= damage;
    }

    public boolean isDead() {
        return hitPoints <= 0;
    }
    public void checkStatus() {
        System.out.println(name + "'s Status:");
        System.out.println("HP: " + hitPoints);
        System.out.println("Attack: " + baseAttack);
        System.out.println();
    }
}
