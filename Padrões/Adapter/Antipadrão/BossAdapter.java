package Antipadrão;

public class BossAdapter {

    GiantEnemySpider boss;

    public void takeDamage(int damageTaken) {
        int temp =  boss.getHp() - (damageTaken - boss.getArmor());
        boss.setHp(temp);
    }
}
