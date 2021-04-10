package day7;

import java.util.Random;

public class Player {
    public final int MAX_STAMINA = 100;
    public final int MIN_STAMINA = 0;
    private int stamina;
    private static int countPlayers = 0;

    public int getStamina() { return stamina; }

    public static int getCountPlayers() { return countPlayers; }

    public Player() {
        if (countPlayers < 6) {
            countPlayers++;
        }
        Random random = new Random();
        this.stamina = random.nextInt(10)+90;
    }

    public void run() {
        if (stamina > 1) {
            stamina--;
        } else if (stamina == 1) {
            stamina--;
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers == 5) {
            System.out.println("Команды неполные. На поле еще есть 1 свободное место");
        } else if (3 <= countPlayers && countPlayers < 5) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных места");
        } else if (countPlayers < 3) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
