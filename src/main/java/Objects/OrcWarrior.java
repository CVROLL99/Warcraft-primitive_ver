package Objects;

import Interfaces.Warrior;

/**
 * Created by Misha on 19.07.2017.
 */
public class OrcWarrior implements Warrior{

    private Integer damage;
    private  Integer hp = 100;
    private String name = "Гоблин";


    public OrcWarrior() {
        System.out.println("Орк - воин создан!");
    }

    public Integer getDamage() {

        toDamage();
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

    public void toDamage() {
        setDamage(20);
    }
}
