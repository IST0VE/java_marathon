package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    Paladin(){
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if (health + 25 > 100){
            health = 100;
        }
        else
            health += 25;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 10 > 100){
            hero.health = 100;
        }
        else
            hero.health += 10;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
