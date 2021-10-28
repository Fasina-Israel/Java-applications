package TikTak;

import static TikTak.Player.PLAYER1;

public class TicTacToe {

    int[][] tikTakArray = new int[3][3];
    CellValues cellValues = CellValues.EMPTY;
    Player player = PLAYER1;


    public int[][] getArray() {
        return this.tikTakArray;
    }

    public void setCellValue(CellValues cellValues) {
        this.cellValues = cellValues;
        }


    public CellValues getCellValue() {
        return cellValues;

    }

    public void setPlayer(Player player) {
        this.player = player;

    }
    public Player getPlayer(){
        return player;
    }
}

