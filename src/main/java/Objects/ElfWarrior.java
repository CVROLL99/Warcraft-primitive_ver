package Objects;


import Interfaces.Warrior;

/**
 * Created by Misha on 18.07.2017.
 */

public class ElfWarrior implements Warrior {

    private Integer damage;
    private  Integer hp = 100;
    private String name = "Воин";

    public ElfWarrior() {
        System.out.println("Эльф - воин создан!");

    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void toDamage() {
        setDamage(15);
    }


    public Integer getDamage() {
        toDamage();
        return damage;
    }
}
