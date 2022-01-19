package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{
    public Shaman(){
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
    }

    @Override
    public void healHimself() {
        if (health + 50 > 100)
            health = 100;
        else
            health += 50;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 30 > 100)
            hero.health = 100;
        else
            hero.health += 30;
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.health - magicAtt - (magicAtt * magicDef) < 0)
            hero.health = 0;
        else
            hero.health -= (magicAtt - (magicAtt * magicDef));
    }

    @Override
    public void physicalAttack(Hero hero) {
        if(hero.health - physAtt - (physAtt * hero.physDef) < 0)
            hero.health = 0;
        else
            hero.health -= (physAtt - (physAtt * hero.physDef));
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
