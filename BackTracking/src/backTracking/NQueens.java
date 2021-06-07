package backTracking;

public class NQueens {

	public static void placeNQueens(int n) {
		int board[][]=new int[n][n];
		solver(board,0);
	}

	private static void solver(int[][] board, int row) {
		// TODO Auto-generated method stub
		if(row==board.length) {
			for(int a=0;a<board.length;a++) {
				for(int b=0;b<board.length;b++) {
					System.out.print(board[a][b]+" ");
				}
				System.out.println();
			}
			System.out.println();
			return;
		}
		for(int col=0;col<board.length;col++) {
			if(isQueenSafeToPlace(board,row,col)) {
				//System.out.println(isQueenSafeToPlace(board, row, col));
				board[row][col]=1;
				solver(board, row+1);
				board[row][col]=0;
			}
		}
		
	}


	private static boolean isQueenSafeToPlace(int[][] board, int row, int col) {
		// TODO Auto-generated method stub
		for(int i=row-1,j=col;i>=0;i--) {
			if(board[i][j]==1) {
				return false;
			}
		}
		for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
			if(board[i][j]==1) {
				return false;
			}
		}
		for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++) {
			if(board[i][j]==1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		placeNQueens(4);

	}

}
