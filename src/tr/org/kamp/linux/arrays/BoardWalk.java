package tr.org.kamp.linux.arrays;

public class BoardWalk {

	public static void main(String[] args) {
		int[][] board = new int[4][4];
		int counter = 0;
		
		for(int i =0;i<board.length;i++) {
			for(int j =0;j<board[i].length;j++) {
				board[i][j] = counter;
			}
		}
		for(int i =0;i<board.length;i++) {
			for(int j =0;j<board[i].length;j++) {
				System.out.println(board[i][j]+"");
				counter++;
			}
			System.out.println();
		}

	}
}
