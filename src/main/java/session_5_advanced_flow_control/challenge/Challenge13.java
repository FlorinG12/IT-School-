package session_5_advanced_flow_control.challenge;

public class Challenge13 {
    public static char OPEN_CELL = '0';
    public static char WALL = '1';
    public static char START = 'S';
    public static char EXIT = 'E';
    public static char PATH = '*';

    public static void main(String[] args) {
        char[][] maze = {{'S', '1', '0', '1'}, {'0', '1', '0', '1'}, {'0', '1', '0', '1'}, {'1', '0', '0', 'E'}};

        char move = 0;
        char positionX = 0;
        char positionY = 0;

        for (int a = 0; a < maze.length; a++) {
            for (int b = 0; b < maze[a].length; b++) {
                if (maze[a][b] == move) {

                    break;
                }
            }
        }


    }
}
