package Padrão;

public class GiantEnemySpider {
    private int hp;
    private int armor;
    private int atk;

    public void receiveBossDamage(int damage) {
        int actualDamage = Math.max(0, damage - this.armor);
        this.hp -= actualDamage;
    }

    public int getBossHp() {
        return hp;
    }

    public int getBossArmor() {
        return armor;
    }

    public int getBossAtk() {
        return atk;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}