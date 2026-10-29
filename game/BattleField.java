package game;

public class BattleField {
    char[][] field = new char[10][10];

    Ship[][] shipMap = new Ship[10][10];
    Ship ship4 = new Ship(4);
    Ship ship3 = new Ship(3);
    Ship ship2 = new Ship(2);
    Ship ship1 = new Ship(1);

    public BattleField (){
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                field[row][col] = ' ';
            }
        }
        field[6][1] = '*';
        shipMap[6][1] = ship4;
        field[6][2] = '*';
        shipMap[6][2] = ship4;
        field[6][3] = '*';
        shipMap[6][3] = ship4;
        field[6][4] = '*';
        shipMap[6][4] = ship4;

        field[2][5] = '*';
        shipMap[2][5] = ship2;
        field[1][5] = '*';
        shipMap[1][5] = ship2;


        field[7][8] = '*';
        shipMap[7][8] = ship1;

        field[2][8] = '*';
        shipMap[2][8] = ship3;
        field[3][8] = '*';
        shipMap[3][8] = ship3;
        field[4][8] = '*';
        shipMap[4][8] = ship3;
    }

    public void print () {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                char cell = field[row][col];

                if (cell == ' ' || cell == '*') {
                    System.out.print(". ");
                }
                else {
                    System.out.print(cell + " ");
                }
            }
            System.out.println();
        }
    }

    public void fire (int col, int row) {
        if (field[row][col] == '*') {
            field[row][col] = 'x';
            Ship hitShip = shipMap[row][col];
            hitShip.takeHit();
            if (!hitShip.sank()){
                System.out.println("Ранил");
            }
            else {
                System.out.println("Убил!");
            }
        } else if (field[row][col] == 'o' || field[row][col] == 'x') {
            System.out.println("Повтор выстрела");
        } else {
            field[row][col] = 'o';
            System.out.println("Мимо");
        }
    }

    public boolean isGameOver(){
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                if (field[row][col] == '*') {
                    return false;
                }
            }
        }
        return true;
    }


}
