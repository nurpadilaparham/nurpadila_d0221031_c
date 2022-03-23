import java.util.*;

public class day32_java_1D_array_part_2 {

    public static boolean canWin(int leap, int[] game) {
        return bfs(leap, game, 0);
    }

    private static boolean bfs (int leap, int[] game, int i){
        if(i<0 || game[i]==1) return false;
        if((i==game.length-1)||i+leap>game.length-1)return true;
        game[i]=1;
        return bfs (leap, game, i-1)||bfs(leap, game, i+1)||bfs(leap, game, i+leap);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}