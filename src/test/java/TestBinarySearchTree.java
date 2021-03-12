import com.bridgelabz.binarysearchtree.BinarySearchTree;
import com.bridgelabz.binarysearchtree.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestBinarySearchTree {
    BinarySearchTree<Integer> tree;
    Node<Integer> root ;
    @BeforeEach
    public void setUp() {
         tree = new BinarySearchTree<>();
         root = new Node<>(11);
        tree.insert(root, 10);
        tree.insert(root, 21);
        tree.insert(root, 54);
        tree.insert(root, 19);

    }

    @Test
    public void insert() {
        tree.insert(root, 10);
        tree.insert(root, 21);
        tree.insert(root, 54);
        tree.insert(root, 19);

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
}
