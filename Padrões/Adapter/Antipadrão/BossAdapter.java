package Antipadrão;

public class BossAdapter implements Enemy{

    GiantEnemySpider boss;

    @Override
    public void takeDamage(int damageTaken) {
        int temp =  boss.getHp() - (damageTaken - boss.getArmor());
        boss.setHp(temp);
    }
}
