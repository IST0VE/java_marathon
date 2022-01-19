package day11.task2;

public abstract class Hero implements PhysAttack{
    final int MIN_HEALTH = 0;
    int health;
    double physDef;
    double magicDef;
    int physAtt;
    int magicAtt;

    public Hero() {
        this.health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.health - (physAtt - ( hero.health)) < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        }
        else{
            hero.health -= (physAtt - ( physAtt * hero.physDef));
        }
    }
}
