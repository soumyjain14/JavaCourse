package backTracking;

public class RatInAMazeAllPaths {

	public static void ratInAMazeAllPaths(int maze[][], int n) {
		int path[][]=new int[n][n];
		solver(maze,0,0,path);
	}
	
	private static void solver(int[][] maze, int i, int j, int[][] path) {
		// TODO Auto-generated method stub
		int n=maze.length;
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1) {
			return;
		}
		path[i][j]=1;		
		if(i==n-1 && j==n-1) {
			for(int r=0;r<n;r++) {
				for(int c=0;c<n;c++) {
					System.out.print(path[r][c]+" ");
				}
				
			}
			path[n-1][n-1]=0;
			System.out.println();
			return;
		}
		//Go Bottom
		solver(maze, i+1, j, path);
		// Go Left
		solver(maze, i, j-1, path);
		// Go Top
		solver(maze, i-1, j, path);
		// Go Right
		solver(maze, i, j+1, path);	
		
		
		path[i][j]=0;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maze[][]= {{1,0,1},{1,1,1},{1,1,1}};
		int n=maze.length;
		ratInAMazeAllPaths(maze,n);

	}

}
