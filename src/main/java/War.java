import Interfaces.Community;
import Objects.*;

import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Misha on 18.07.2017.
 */
public class War {

    public static int attack;
    /**
     * объявляем все классы, которые могут быть созданы
     */
    public static Integer numberOfTeam1, numberOfTeam2;//Какая команда создается, кто ходит первый
    public String nameCommand1, nameCommand2;//Имя команды
    public Integer teamTurn;//ход какой команды
    public Integer whoTurn,whoAttacked;//кто атакует, кого атакуем
    public ElfAncor elfAncor1, elfAncor2, elfAncor3;
    public ElfMag elfMag1;
    public ElfWarrior elfWarrior1, elfWarrior2, elfWarrior3, elfWarrior4;
    public HumanAncor humanAncor1, humanAncor2, humanAncor3;
    public HumanMag humanMag1;
    public HumanWarrior humanWarrior1, humanWarrior2, humanWarrior3, humanWarrior4;
    public OrcAncor orcAncor1, orcAncor2, orcAncor3;
    public OrcMag orcMag1;
    public OrcWarrior orcWarrior1, orcWarrior2, orcWarrior3, orcWarrior4;
    public UndeadAncor undeadAncor1, undeadAncor2, undeadAncor3;
    public UndeadMag undeadMag1;
    public UndeadWarrior undeadWarrior1, undeadWarrior2, undeadWarrior3, undeadWarrior4;
    public static List<Community> firstTeam = new ArrayList();//Коллекция с первой командой
    public static List<Community> secondTeam = new ArrayList();//Коллекция с первой командой
    public static List<Community> actualTeam = new ArrayList();//Команда которая ходит
    public static List<Community> attackedTeam = new ArrayList();//Команда, которую актакуем
    public List<String> nameList = new ArrayList();//Словарь имен для персов

    /**
     * Метод для задания имен персам
     */
    public void nameGen(){
        nameList.add("Павлик");
        nameList.add("Миклуша");
        nameList.add("Ослик");
        nameList.add("Гэндальф");
        nameList.add("Рокланд");
        nameList.add("Рохан");
        nameList.add("Негев");
        nameList.add("Ирланд");
        nameList.add("Легаси");
        nameList.add("Мишустик");
        nameList.add("Саруман");
        nameList.add("Евген");
        nameList.add("Ромик");
        nameList.add("Сенар");
        nameList.add("Ренар");
        nameList.add("Шон");
        nameList.add("Миртан");
        nameList.add("Дорен");
        nameList.add("Флекс");
        nameList.add("Герман");
        nameList.add("Леля");
        nameList.add("Павлик");
        nameList.add("Миклуша");
        nameList.add("Ослик");
        nameList.add("Гэндальф");
        nameList.add("Рокланд");
        nameList.add("Джон");
        nameList.add("Ревель");
        nameList.add("Виндзор");
        nameList.add("Печен");
        nameList.add("Азамат");
        nameList.add("Квролл");
        nameList.add("Юджин");
        nameList.add("Скани");
        nameList.add("Малдер");
        nameList.add("Ибирс");
        nameList.add("Герна");
        nameList.add("Сандей");
        nameList.add("Жез");
        nameList.add("Укенрол");
        nameList.add("Исильдур");
        nameList.add("Савана");

    }
    /**
     * Кто с кем играет
     */
    public void chooseTeam() {
        nameGen();
        numberOfTeam1 = (int) (Math.random() * 2);
        numberOfTeam2 = (int) (Math.random() * 2);

        if (numberOfTeam1 == 0) {
            nameCommand1 = "Эльфы";
            System.out.println('\n' + "***************************" + '\n' + "**" + " Первая команда - " + nameCommand1 +
                    " **" + '\n' + "***************************" + '\n');

            firstTeam.add(elfAncor1 = new ElfAncor());
            firstTeam.add(elfAncor2 = new ElfAncor());
            firstTeam.add(elfAncor3 = new ElfAncor());
            firstTeam.add(elfMag1 = new ElfMag());
            firstTeam.add(elfWarrior1 = new ElfWarrior());
            firstTeam.add(elfWarrior2 = new ElfWarrior());
            firstTeam.add(elfWarrior3 = new ElfWarrior());
            firstTeam.add(elfWarrior4 = new ElfWarrior());
            for(Community community:firstTeam){
                int x = (int) (Math.random()*40);
                String newName = community.getName() + " " + nameList.get(x);
                community.setName(newName);
            }



        } else {
            nameCommand1 = "Люди";
            System.out.println('\n' + "***************************" + '\n' + "**" + " Первая команда - " + nameCommand1 +
                    " **" + '\n' + "***************************" + '\n');
            firstTeam.add(humanAncor1 = new HumanAncor());
            firstTeam.add(humanAncor2 = new HumanAncor());
            firstTeam.add(humanAncor3 = new HumanAncor());
            firstTeam.add(humanMag1 = new HumanMag());
            firstTeam.add(humanWarrior1 = new HumanWarrior());
            firstTeam.add(humanWarrior2 = new HumanWarrior());
            firstTeam.add(humanWarrior3 = new HumanWarrior());
            firstTeam.add(humanWarrior4 = new HumanWarrior());
            for(Community community:firstTeam){
                int x = (int) (Math.random()*40);
                String newName = community.getName() + " " + nameList.get(x);
                community.setName(newName);
            }
        }
        if (numberOfTeam2 == 0) {
            nameCommand2 = "Орки";
            System.out.println('\n' + "***************************" + '\n' + "**" + " Вторая команда - " +
                    "" + nameCommand2 + " **" + '\n' + "***************************" + '\n');
            secondTeam.add(orcAncor1 = new OrcAncor());
            secondTeam.add(orcAncor2 = new OrcAncor());
            secondTeam.add(orcAncor3 = new OrcAncor());
            secondTeam.add(orcMag1 = new OrcMag());
            secondTeam.add(orcWarrior1 = new OrcWarrior());
            secondTeam.add(orcWarrior2 = new OrcWarrior());
            secondTeam.add(orcWarrior3 = new OrcWarrior());
            secondTeam.add(orcWarrior4 = new OrcWarrior());
            for(Community community:secondTeam){
                int x = (int) (Math.random()*40);
                String newName = community.getName() + " " + nameList.get(x);
                community.setName(newName);
            }
        } else {
            nameCommand2 = "Нежить";
            System.out.println('\n' + "***************************" + '\n' + "**" + " Вторая команда - " +
                    "" + nameCommand2 + " **" + '\n' + "***************************" + '\n');
            secondTeam.add(undeadAncor1 = new UndeadAncor());
            secondTeam.add(undeadAncor2 = new UndeadAncor());
            secondTeam.add(undeadAncor3 = new UndeadAncor());
            secondTeam.add(undeadMag1 = new UndeadMag());
            secondTeam.add(undeadWarrior1 = new UndeadWarrior());
            secondTeam.add(undeadWarrior2 = new UndeadWarrior());
            secondTeam.add(undeadWarrior3 = new UndeadWarrior());
            secondTeam.add(undeadWarrior4 = new UndeadWarrior());
            for(Community community:secondTeam){
                int x = (int) (Math.random()*40);
                String newName = community.getName() + " " + nameList.get(x);
                community.setName(newName);
            }
        }
    }

    /**
     * Генератор случайных чисел для атаки
     */
    public void randomAttack() {

        System.out.println("------------------" + '\n' + "Игра началась!" + '\n' + "------------------");


        RunWar runWar = new RunWar();
        Thread firstTeamThread = new Thread(runWar);
        Thread secondTeamThread = new Thread(runWar);
        firstTeamThread.setName(nameCommand1);
        secondTeamThread.setName(nameCommand2);
        teamTurn = (int) (Math.random() * 2);
        if (teamTurn == 0) {
            firstTeamThread.start();
            secondTeamThread.start();
            }else{
            secondTeamThread.start();
            firstTeamThread.start();
        }


    }



    public class RunWar implements Runnable {

        /**
         * Метод выбирает актуальную коллекцию для потока
         */
        public void setActualTeam(){
            actualTeam = secondTeam;
            attackedTeam = firstTeam;
            if (Thread.currentThread().getName()==nameCommand1) {
                actualTeam = firstTeam;
                attackedTeam = secondTeam;
            }
        }

        /**
         * Метод выбирает количество действий для клана
         */
        public synchronized void getObject() {

            setActualTeam();
            attack = (int) (Math.random() * 7 + 1);//Сколько ходов сделает группа (+1 потому что не должно получиться ноль)

            System.out.println("Ходят " + Thread.currentThread().getName() + '\n' +
                    "Группа сделает " +
                    attack + " хода (-ов)" + '\n' + "------------------");

                while (attack > 0) {

                    whoTurn = (int) (Math.random() * 7 + 1);//какой перс ходит
                    whoAttacked = (int) (Math.random() * 7 + 1);//кого атакуют
                    Integer newHP = attackedTeam.get(whoAttacked).getHp() - actualTeam.get(whoTurn).getDamage();//Новое значение здоровья
                    attackedTeam.get(whoAttacked).setHp(newHP);


                    try {

                        System.out.println("Ходит " + actualTeam.get(whoTurn).getName() + "(" + actualTeam.get(whoTurn)
                                .getHp() + ") ----> наносит урон " + actualTeam.get(whoTurn).getDamage() + " " +
                                attackedTeam.get
                                (whoAttacked).getName() + "" + "(" + newHP + ")");

                        if (attackedTeam.get(whoAttacked).getHp() <= 0) {//Если перса завалили
                            System.out.println(attackedTeam.get(whoAttacked).getName() + " Пал смертью храбрых");
                            attackedTeam.remove(whoAttacked);
                            System.out.println(attackedTeam.size());
                        }

                        Thread.sleep(1400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    attack--;

                }
                System.out.println("------------------" + '\n' + Thread.currentThread().getName() +
                        ": Мы сразились, Ваше Высочество!" + '\n'
                        + "------------------");


        }

        /**
         * Запуск потока
         */
        public void run() {
                getObject();

        }



    }
}



