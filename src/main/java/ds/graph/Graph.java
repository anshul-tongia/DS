package ds.graph;

import java.util.*;

public class Graph {

    private Map<String, List<String>> vertices;

    public Graph() {
        this.vertices = new HashMap<>();
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdges("A", "B");
        graph.addEdges("A", "C");
        graph.addEdges("A", "D");
        graph.addEdges("A", "E");

        graph.addEdges("B", "A");
        graph.addEdges("B", "C");
        graph.addEdges("B", "G");

        graph.addEdges("C", "A");
        graph.addEdges("C", "B");
        graph.addEdges("C", "D");

        graph.addEdges("D", "A");
        graph.addEdges("D", "C");
        graph.addEdges("D", "E");
        graph.addEdges("D", "H");

        graph.addEdges("E", "A");
        graph.addEdges("E", "D");
        graph.addEdges("E", "F");

        graph.addEdges("F", "E");
        graph.addEdges("F", "G");
        graph.addEdges("F", "E");

        graph.addEdges("G", "B");
        graph.addEdges("G", "F");

        graph.addEdges("H", "D");
        graph.addEdges("H", "F");


        System.out.println(graph);
        System.out.println(graph.isConnected("A", "B"));
        System.out.println(graph.isConnected("A", "C"));

        System.out.println("Print Graph : DFS ");
        graph.bfs("A");
        System.out.println("Print Graph : BFS ");
        graph.dfs("A");

    }

    public void addEdges(String u, String v) {
        if (this.vertices.containsKey(u)) {
            this.vertices.get(u).add(0, v);
        } else {
            List<String> list = new LinkedList<>();
            list.add(0, v);
            this.vertices.put(u, list);
        }
    }

    public boolean isConnected(String u, String v) {
        return (vertices.containsKey(u) && vertices.get(u).contains(v));
    }

    @Override
    public String toString() {
        String result = "";

        for (Map.Entry<String, List<String>> entry : vertices.entrySet()) {
            result += entry.getKey() + " => " + entry.getValue().toString() + "\n";
        }


        return result;
    }

    private void bfs(String start) {
        Queue<String> queue = new LinkedList<>();
        Set<String> seen = new HashSet<>();
        queue.offer(start);
        while (!queue.isEmpty()) {
            String curr = queue.poll();
            if (!seen.contains(curr)) {
                seen.add(curr);
                System.out.print(curr + " ");
            }
            if (vertices.get(curr) != null) {
                for (String adj : vertices.get(curr)) {
                    if (!seen.contains(adj)) {
                        queue.offer(adj);
                    }
                }
            }
        }
        System.out.println();
    }

    private void dfs(String start) {
        Stack<String> stack = new Stack<>();
        Set<String> seen = new HashSet<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            String curr = stack.pop();
            if (!seen.contains(curr)) {
                seen.add(curr);
                System.out.print(curr + " ");
            }
            if (vertices.get(curr) != null) {
                for (String adj : vertices.get(curr)) {
                    if (!seen.contains(adj)) {
                        stack.push(adj);
                    }
                }
            }
        }
        System.out.println();
    }


}