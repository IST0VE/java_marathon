package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack{
    public Magician(){
        health = 100;
        magicDef = 0.8;
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.health - (magicAtt - ( hero.health)) < 0){
            hero.health = 0;
        }
        else
            hero.health -= (magicAtt - (magicAtt * hero.magicDef));

    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.health - (physAtt - ( hero.health)) < 0)
            hero.health = 0;
        else
            hero.health -= (physAtt - (physAtt * hero.magicDef));
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
