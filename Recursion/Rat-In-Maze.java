class Solution {
	ArrayList<String> list = new ArrayList<>();
	public ArrayList<String> ratInMaze(int[][] maze) {
		// code here
		if (maze[0][0]==0 ||maze[maze.length - 1][maze.length - 1] == 0)
			return list;
		Set<Integer> set = new HashSet<>();
		StringBuilder s = new StringBuilder();
		findPath(maze, 0, 0, set, s);
		Collections.sort(list);
        return list;
	}
	public void findPath(int[][] maze, int row, int col, Set<Integer> set, StringBuilder s) {
		if (row == maze.length - 1 && col == maze.length - 1) {
			list.add(s.toString());
			return;
		}
		set.add(row*maze.length + col);
		if (check(maze, row + 1, col, set)) {
			findPath(maze, row + 1, col, set, s.append('D'));
			s.deleteCharAt(s.length() - 1);
		}
		if (check(maze, row - 1, col, set)) {
			findPath(maze, row - 1, col, set, s.append('U'));
			s.deleteCharAt(s.length() - 1);
		}
		if (check(maze, row, col + 1, set)) {
			findPath(maze, row, col + 1, set, s.append('R'));
			s.deleteCharAt(s.length() - 1);
		}
		if (check(maze, row, col - 1, set)) {
			findPath(maze, row, col - 1, set, s.append('L'));
			s.deleteCharAt(s.length() - 1);
		}
		set.remove(row*maze.length + col);
	}
	public boolean check(int[][] maze, int row, int col, Set<Integer> set) {
		if (row >= 0 && row<maze.length && col >= 0 && col <maze.length && !set.contains(row*maze.length + col)) {
			if (maze[row][col] == 1) {
				return true;
			}
		}
		return false;
	}
}
