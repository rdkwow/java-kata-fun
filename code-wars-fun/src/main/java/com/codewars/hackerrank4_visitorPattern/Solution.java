package main.java.com.codewars.hackerrank4_visitorPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();

    public abstract void visitNode(TreeNode node);

    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    private int result;

    public int getResult() {
        //implement this
        return result;
    }

    public void visitNode(TreeNode node) {
    }

    public void visitLeaf(TreeLeaf leaf) {

        result = result + leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private int result = 1;

    public int getResult() {

        return result;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            result = result * node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED)
            result = result * leaf.getValue();
    }
}

class FancyVisitor extends TreeVis {
    private int greenLeafResult = 0;

    int depth = 1;
    int depthResult;

    public int getResult() {
        //implement this
        return Math.abs(depthResult - greenLeafResult);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            depthResult += node.getValue();
        }

    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN)
            greenLeafResult = greenLeafResult * leaf.getValue();
    }
}

class Edge {
    private int parent;
    private int child;

    public Edge(int parent, int child) {
        this.parent = parent;
        this.child = child;
    }

    public int getParent() {
        return parent;
    }

    public int getChild() {
        return child;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "parent=" + parent +
                ", child=" + child +
                '}';
    }
}


public class Solution {
    public static Tree solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nodeValues = getNodeValue(n);
        List<Color> nodeColours = getNodeColour(n);
        List<Edge> nodeEdge = getNodeEdge(n);

//        nodeValues.forEach(System.out::println);
//        nodeColours.forEach(System.out::println);
//        nodeEdge.forEach(System.out::println);

        List<Integer> nodeIndexList = isNode(nodeEdge);

        for (int z = 0; z<nodeIndexList.size();z++){
            TreeNode tree = new TreeNode(nodeValues.get(nodeIndexList.get(0)), nodeColours.get(nodeIndexList.get(0)), nodeIndexList.get(0) -1 );

        }
//        isLeaf(nodeEdge);

        TreeNode tree = new TreeNode(nodeValues.get(0), nodeColours.get(0), 0);
        for (int i = 1; i < n; i++) {

            tree.addChild(new TreeNode(nodeValues.get(i), nodeColours.get(i), 0));
            tree.addChild(new TreeLeaf(nodeValues.get(i), nodeColours.get(i), 0));

        }
        return tree;
    }

    public static List<Integer> isNode(List<Edge> edges) {

        List<TreeNode> treeNodes = new ArrayList<>();
        List<Integer> integerList = edges.stream().map(edge -> edge.getParent()).distinct().collect(Collectors.toList());

        edges.stream().filter(element -> !integerList.contains(element.getParent())).forEach(System.out::println);
        System.out.println("#####");
        edges.stream().filter(element -> integerList.contains(element.getParent())).forEach(System.out::println);


//        for (int i = 0; i < parents.size(); i++) {
//            for (int j = i + 1 ; j < parents.size(); j++) {
//                if (parents.get(i).equals(parents.get(j))) {
//                    System.out.println(parents.get(i));
//                }
//            }
//        }
        for(int i = 0; i<edges.size();i++) {

        }
        return integerList;
    }

    public static List<TreeLeaf> isLeaf(List<Edge> edges) {

        List<TreeLeaf> treeLeaves = new ArrayList<>();

        List<Integer> parents = edges.stream().map(edge -> edge.getParent()).collect(Collectors.toList());
        for (int i = 0; i < parents.size(); i++) {
            for (int j = i + 1 ; j < parents.size(); j++) {
                if (parents.get(i).equals(parents.get(j))) {
                    System.out.println(parents.get(i));
                }
            }
        }
        return treeLeaves;
    }

    private static List<Color> getNodeColour(int n) {
        List<Color> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            int valueOfColor = sc.nextInt();
            if (valueOfColor == 1) {
                result.add(Color.RED);
            } else {
                result.add(Color.GREEN);
            }
        }
        return result;
    }

    private static List<Integer> getNodeValue(int n) {
        List<Integer> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            result.add(sc.nextInt());
        }
        return result;
    }

    private static List<Edge> getNodeEdge(int n) {
        List<Edge> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= n - 1; i++) {
            result.add(new Edge(sc.nextInt(), sc.nextInt()));
        }
        return result;
    }


    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

//        System.out.println(res1);
//        System.out.println(res2);
//        System.out.println(res3);
    }
}
