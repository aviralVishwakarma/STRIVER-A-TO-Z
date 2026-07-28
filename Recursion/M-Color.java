class Solution {
	boolean graphColoring(int v, int[][] edges, int m) {
		// code here
		HashMap<Integer, Integer> map = new HashMap<>();
		return color(0, m, map, v, edges);
	}
	public boolean color(int vertex, int m, HashMap<Integer, Integer> map, int v, int[][] edges) {
		if (vertex == v) {
			return true;
		}
		for (int i = 1 ; i <= m ; i++) {
			if (check(i, vertex, map, edges)) {
				map.put(vertex, i);
				if (color(vertex + 1, m, map, v, edges)) {
					return true;
				}
				map.remove(vertex);
			}
		}
		return false;
	}
	public boolean check(int color, int vertex, HashMap<Integer, Integer> map, int[][] edges) {
		for (int i = 0 ; i < edges.length ; i++) {
			if (edges[i][0] == vertex) {
				if (map.get(edges[i][1]) != null && map.get(edges[i][1]) == color) {
					return false;
				}
			}
			else if (edges[i][1] == vertex) {
				if (map.get(edges[i][0]) != null && map.get(edges[i][0]) == color) {
					return false;
				}
			}
		}
		return true;
	}
}
