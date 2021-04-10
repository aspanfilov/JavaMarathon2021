package day7;

public class Task2 {
    public static void main(String[] args) {
        Player.info();
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        Player.info();
        for (int i = 0; i<200; i++) {
            p1.run();
        }
        Player.info();

        Player p5 = new Player();
        Player p6 = new Player();
        Player p7 = new Player();
        Player p8 = new Player();
        Player.info();

        System.out.println("p1 " + p1.getStamina());
        System.out.println("p2 " + p2.getStamina());
        System.out.println("p3 " + p3.getStamina());
        System.out.println("p4 " + p4.getStamina());
        System.out.println("p5 " + p5.getStamina());
        System.out.println("p6 " + p6.getStamina());
        System.out.println("p7 " + p7.getStamina());
        System.out.println("p8 " + p8.getStamina());

        System.out.println("Всего игроков: " + Player.getCountPlayers());
    }
}
