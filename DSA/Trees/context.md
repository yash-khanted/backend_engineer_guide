# Trees
A tree is a hierarchical data structure/non linear data structure that represents data in nodes. Each node can be connected to many nodes. But the node originating from the same parent cannot be connected.

```
public class Tree{
    public class Node{
        private int value;
        //all the children node are represented by a linked list so only the root node is collected
        private Node root;

        public Node(int value, Node root){
            this.value = value;
            this.root = root;
        }
    }

    
}
```

## Binary Search Tree
A special tree constructed such that at each node the node.left.data <= node.data < node.right.data