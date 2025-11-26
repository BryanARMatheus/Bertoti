package Padrão;

public class SmallEnemySpider implements Enemy {
    private int hp;
    private int atk;

    @Override
    public void takeDamage(int damageTaken) {
        this.hp -= damageTaken;
    }

    @Override
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}