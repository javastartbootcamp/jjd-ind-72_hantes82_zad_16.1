package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        System.out.println("Podaj porę roku:");
        for (Season season : Season.values()) {
            System.out.println(season.getTranslation());
        }
        String input = scanner.nextLine();
        Season userSeason = Season.findSeason(input);
        if (userSeason != null) {
            System.out.println("W tej porze roku są następujące miesiące:");
            System.out.println(Arrays.toString(userSeason.getMonths()));
        } else {
            System.out.println("Nieprawidłowa pora roku.");
        }
    }
}
