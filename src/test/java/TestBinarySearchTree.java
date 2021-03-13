import com.bridgelabz.binarysearchtree.BinarySearchTree;
import com.bridgelabz.binarysearchtree.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestBinarySearchTree {
    BinarySearchTree<Integer> tree;
    Node<Integer> root ;
    @BeforeEach
    public void setUp() {
        tree = new BinarySearchTree<>();
        root = new Node<>(56);
        tree.insert(root, 30);
        tree.insert(root, 70);
        tree.insert(root, 22);
        tree.insert(root, 40);
        tree.insert(root, 60);
        tree.insert(root, 95);
        tree.insert(root, 11);
        tree.insert(root, 65);
        tree.insert(root, 3);
        tree.insert(root, 16);
        tree.insert(root, 63);
        tree.insert(root, 67);

    }

    @Test
    public void insert() {
        tree.insert(root, 30);
        tree.insert(root, 70);
        tree.insert(root, 22);
        tree.insert(root, 40);
        tree.insert(root, 60);
        tree.insert(root, 95);
        tree.insert(root, 11);
        tree.insert(root, 65);
        tree.insert(root, 3);
        tree.insert(root, 16);
        tree.insert(root, 63);
        tree.insert(root, 67);

    }

    @Test
    public void inOrder() {
        System.out.println("--------------");
        tree.inOrder(root);
    }
    @Test
    public void preOrder() {
        System.out.println("--------------");
        tree.preOrder(root);
    }
    @Test
    public void postOrder() {
        System.out.println("--------------");
        tree.postOrder(root);
    }

    @Test
    public void testSize(){

        Assertions.assertEquals(13, tree.size(root));
    }

    @Test
    public void testSearch_true() {
        Assertions.assertEquals(true, tree.search(root, 63));
        System.out.println("Element found");
    }
    @Test
    public void testSearch_false() {
        Assertions.assertEquals(false, tree.search(root, 100));
    }
}
