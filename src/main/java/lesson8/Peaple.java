package lesson8;

public class Peaple {

    public static void main(String[] args) {
        Human me = new Male("danil", 33, "rus", true);
        Human natalia = new Female("natalia", 33, "rus", false);
        me.beOlder();
        natalia.setAge(67);
        System.out.println(me);
        System.out.println(natalia);
        Human[] peaple = new Human[]{me, natalia};
        for (Human human: peaple){
            human.setAge(40);
        }
        ((Male)me).drive();
        ((Female)natalia).cook();

    }

}
