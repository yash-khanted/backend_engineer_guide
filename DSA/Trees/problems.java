package Trees;

class Node{
    int value;
    Node left;
    Node right;
    
    Node(int value){
        this.value = value;
        left = null;
        right = null;
    }    
}

public class problems {
    /************************ Traversals ***************************/
    /////////////////////////////////////////////////////////////////

    // 1. Inorder Traversal
    //    a. Creating a tree from an arrray of numbers listed in inorder traversal fashion
    public void InorderTraversal(String values){
        
    }
}


////////////////////////////////////////////////////////////////
/*Symmetry in a tree */
////////////////////////////////////////////////////////////////
//Question: Return 1 if the left half of the tree a is the mirror image for the right half
/*idea 1: perform inorder traversal and create a array. 
        If the reverse of array list is same as the original, then symmetry is there
 *Idea 2: using recursion
*/

public boolean isTheTreeSymmetric(TreeNode leftHalf, TreeNode rightHalf){
    //if the both left and right half is null: base condition
    if(leftHalf == null && rightHalf == null) return true;

    //if one of the half is null then no point in symmetry check
    if(leftHalf == null || rightHalf == null) return false;

    //if data in two half is not same then no symmetry
    if(leftHalf.value != rightHalf.value) return false;

    //if value are correct then check the mirror property
    if(isTheTreeSymmetric(leftHalf.left, rightHalf.right) && isTheTreeSymmetric(leftHalf.right, rightHalf.left)) return true;

    //above mirror rule does not satisfy then tree is not symmetric
    return false;
}