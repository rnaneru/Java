package utils;

import java.io.IOException;

public class ConsoleCleaner {
    public static void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            System.err.println("Ошибка: очистка консоли не поддерживается у вас на пк.");
        }
    }
}
