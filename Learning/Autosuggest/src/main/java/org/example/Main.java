package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        bst.insert(100);
        bst.inOrder(bst.root);
        System.out.println();
//        bst.deleteNode(bst.root, 70);
//        bst.delNode(bst.root, 70);
//        System.out.println();
//        bst.inOrder(bst.root);
//        System.out.println();
//        bst.postOrder(bst.root);
//        bst.preOrder(bst.root);

//        AutoSuggestEngine autoSuggestEngine = new AutoSuggestEngine();
//        autoSuggestEngine.insert("apple");
//        autoSuggestEngine.insert("app");
//        autoSuggestEngine.insert("apricot");
//        autoSuggestEngine.insert("banana");
//        autoSuggestEngine.insert("blackberry");
//        autoSuggestEngine.insert("carrot");
//        autoSuggestEngine.insert("cabbage");
//
//        System.out.println("Suggestions for 'ap': " + autoSuggestEngine.getSuggestions("ap"));
//        System.out.println("Suggestions for 'b': " + autoSuggestEngine.getSuggestions("b"));
//        System.out.println("Suggestions for 'ca': " + autoSuggestEngine.getSuggestions("ca"));

//        PracticeBST.insert(20);
//        PracticeBST.insert(10);
//        PracticeBST.insert(40);
//        PracticeBST.insert(80);
//        PracticeBST.insert(50);
//        PracticeBST.insert(5);

//        System.out.println(PracticeBST.kthSmallest(5));

        PracticeBST bst2 = new PracticeBST();
        int[] values = {20, 10, 50, 7, 80, 30}; // 7, 10, 20, 30, 50, 80

        for (int element : values) {
            bst2.insert(element);
        }

        System.out.println("Closest value to target 18:  " + bst2.closestToTarget(18)); // 20
    }
}
