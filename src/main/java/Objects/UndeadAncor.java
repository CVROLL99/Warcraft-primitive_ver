package Objects;

import Interfaces.Ancor;

/**
 * Created by Misha on 19.07.2017.
 */
public class UndeadAncor implements Ancor {

    public UndeadAncor() {
        System.out.println("Нежить - лучник создан!");
    }



    private Integer damage;
    private  Integer hp = 100;
    private String name = "Охотник";


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
        setDamage(4);

    }

    public void toDamage() {
        setDamage(2);
    }
}
