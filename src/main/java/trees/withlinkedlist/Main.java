package trees.withlinkedlist;

public class Main {
    public static void main(String[] args) {
        TreeWithLinkedListOfChildren tree = new TreeWithLinkedListOfChildren();
        tree.createNodes();
        tree.printPreorder();
        // tree.printByLevel();
        // System.out.println(tree.serialize());
        // System.out.println(tree.numNodes());
        // System.out.println(tree.numLeaves());
        // System.out.println(tree.numLevels());


    }
}
