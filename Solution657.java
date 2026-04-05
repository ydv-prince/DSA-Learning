//657. Robot Return to Origin
public class Solution657 {
    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for(char move : moves.toCharArray()){
            switch(move){
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                default:
                    break;
            }
        }

        return x == 0 && y == 0;
    }
}
