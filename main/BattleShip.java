package main;

import game.BattleField;
import utils.ConsoleCleaner;

import java.util.Scanner;

public class BattleShip {


    public static void main(String[] args) {
        String playerName = (args.length > 0)? args[0] : "Игрок";
        System.out.println("Приветствую, " + playerName + ". Да начнётся морской бой.");

        BattleField field = new BattleField();
        field.print();

        Scanner scanner = new Scanner(System.in);


        while (!field.isGameOver()){
            System.out.println("Введите координаты удара");
            String input = scanner.nextLine();
            int col = input.charAt(0) - 'А';
            int row = input.charAt(1) - '1';

            field.fire(col, row);
            ConsoleCleaner.clear();
            field.print();

        }

    }


}