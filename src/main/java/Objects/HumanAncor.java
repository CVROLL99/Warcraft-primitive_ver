package Objects;

import Interfaces.Ancor;

/**
 * Created by Misha on 18.07.2017.
 */
public class HumanAncor implements Ancor {

    private Integer damage;
    private Integer hp = 100;
    private String name = "Арбалетчик";

    public HumanAncor() {
        System.out.println("Человек - лучник создан!");
    }

    public Integer getDamage() {
        int attackMethod = (int) (Math.random()*2);
        toDamage();
        if(attackMethod==0){
            toShoot();}
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

    public void toShoot() {
        setDamage(5);
    }

    public void toDamage() {
        setDamage(3);
    }
}
