package Objects;

import Interfaces.Mag;

/**
 * Created by Misha on 18.07.2017.
 */
public class ElfMag implements Mag {

    private Integer damage;
    private  Integer hp = 100;
    private  String name = "Маг";

    public ElfMag() {
        System.out.println("Эльф - маг создан!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getDamage() {

        magicDamage();
        return damage;
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

    public void toBless() {

    }

    public void magicDamage() {
        setDamage(10);
    }

    public void toCurse() {

    }
}
