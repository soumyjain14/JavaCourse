package backTracking;

public class RatInAMaze {

	public static boolean ratInAMaze(int maze[][]) {
		int n=maze.length;
		int path[][]=new int[n][n];
		return solver(maze,0,0,path);

	}

	private static boolean solver(int[][] maze, int i, int j, int[][] path) {
		// TODO Auto-generated method stub
		int n=maze.length;
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1) {
			return false;
		}
		path[i][j]=1;
		
		if(i==n-1 && j==n-1) {
			for(int r=0;r<n;r++) {
				for(int c=0;c<n;c++) {
					System.out.print(path[r][c]+" ");
				}
				System.out.println();
			}
			return true;
		}
		
		// Go Top
		if(solver(maze, i-1, j, path)) {
			return true;
		}

		// Go Right
		if(solver(maze, i, j+1, path)) {
			return true;
		}
		//Go Bottom
		if(solver(maze, i+1, j, path)) {
			return true;
		}
		// Go Left
		if(solver(maze, i, j-1, path)) {
			return true;
		}
		return false;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maze[][]= {{1,1},{1,1}};
		System.out.println(ratInAMaze(maze));

	}

}
