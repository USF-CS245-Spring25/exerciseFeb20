package trees.witharray;

public class TreeWithArrayOfChildrenExample {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.createTree();
        t.printNodesPreorder();
        System.out.println();
        System.out.println(t.serialize());
        // t.printByLevel();
        // System.out.println(t.numLevels());
        // System.out.println(t.numNodes());
        // System.out.println(t.numLeaves());

    }
}
