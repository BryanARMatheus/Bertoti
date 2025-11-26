package Padrão;

public class BossAdapter implements Enemy {
    private GiantEnemySpider boss;

    public BossAdapter(GiantEnemySpider boss) {
        this.boss = boss;
    }

    @Override
    public void takeDamage(int damageTaken) {
        boss.receiveBossDamage(damageTaken);
    }

    @Override
    public int getHp() {
        return boss.getBossHp();
    }

    @Override
    public int getAtk() {
        return boss.getBossAtk();
    }

    public int getArmor() {
        return boss.getBossArmor();
    }
}