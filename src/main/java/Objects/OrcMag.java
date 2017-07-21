package Objects;

import Interfaces.Mag;

/**
 * Created by Misha on 19.07.2017.
 */
public class OrcMag implements Mag {

    private Integer damage;
    private  Integer hp = 100;
    private String name = "Шаман";

    public OrcMag() {
        System.out.println("Орк - маг создан!");
    }

    public Integer getDamage() {

        damage = 0;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void toBless() {

    }

    public void magicDamage() {


    }

    public void toCurse() {

    }
}
