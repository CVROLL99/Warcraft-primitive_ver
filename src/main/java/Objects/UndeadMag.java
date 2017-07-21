package Objects;

import Interfaces.Mag;

/**
 * Created by Misha on 19.07.2017.
 */
public class UndeadMag implements Mag {

    private Integer Damage;
    private  Integer hp = 100;
    private String name = "Некромант";

    public UndeadMag() {
        System.out.println("Нежить - маг создан!");
    }

    public Integer getDamage() {
        magicDamage();
        return Damage;
    }

    public void setDamage(Integer damage) {
        Damage = damage;
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
        setDamage(5);
    }

    public void toCurse() {

    }
}
