package Antipadrão;

public class SmallEnemySpider implements Enemy{
    private int hp;
    private int atk;

    public void takeDamage(int damageTaken){
        this.hp = this.hp - damageTaken;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}
