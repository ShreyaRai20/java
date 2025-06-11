import java.util.*;

// public class BinaryTrees1 {

//     // static class Node{

//     //     int data;
//     //     Node left;
//     //     Node right;

//     //     Node(int data){
//     //         this.data = data;
//     //         this.left = null;
//     //         this.right = null;
//     //     }
//     // }

//     // static class BinaryTree{
//     //     static int idx = -1;

//     //     // take all nodes and return root node
//     //     public static Node buildTree(int nodes[]){
//     //         idx++;
//     //         if(nodes[idx] == -1){
//     //             return null;
//     //         }

//     //         Node newNode = new Node(nodes[idx]);
//     //         newNode.left = buildTree(nodes);
//     //         newNode.right = buildTree(nodes);

//     //         return newNode;
//     //     }

//     // }

//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree{
//         static int idx = -1;

//         // BackTracking and Recursion
//         public static Node buildTree(int[] nodes){
//             idx++;

//             if(nodes[idx] == -1){
//                 return null;
//             }

//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;
//         }
//     }

//     public static void preorder(Node root){
//         if(root == null){
//             System.out.print(-1 + " ");
//             return;
//         }

//         System.out.print(root.data + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     public static void inorder(Node root){
//         if(root == null) return;

//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);

//     }
//     public static void postorder(Node root){
//         if(root == null) return;

//         postorder(root.left);
//         postorder(root.right);
//         System.out.print(root.data + " ");
//     }

//     // public static void levelOrder(Node root){
//     //     if(root ==null) return;
//     //     Queue<Node> q = new LinkedList<>();
//     //     q.add(root);
//     //     q.add(null);

//     //     while(!q.isEmpty()){
//     //         Node currNode = q.remove();
//     //         if(currNode == null){
//     //             System.out.println();
//     //             if(q.isEmpty()) break;
//     //             else q.add(null);

//     //         }else{
//     //             System.out.print(currNode.data + " ");
//     //             if(currNode.left != null) q.add(currNode.left);
//     //             if(currNode.right != null) q.add(currNode.right);
//     //         }

//     //     }

//     // }

//     // public static void levelOrder(Node root){
//     //     if(root == null) return;
//     //     Queue<Node> q = new LinkedList<>();
//     //     q.add(root);
//     //     q.add(null);

//     //     while(!q.isEmpty()){
//     //         Node currNode = q.remove();
//     //         if(currNode == null){
//     //             System.out.println();
//     //             if(q.isEmpty()) break;
//     //             else q.add(null);
//     //         } else{
//     //             System.out.print(currNode.data + " ");
//     //             if(currNode.left != null) q.add(currNode.left);
//     //             if(currNode.right != null) q.add(currNode.right);
//     //         }
//     //     }
//     // }

//     public static void levelOrder(Node root){
//         if(root == null) return;
//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
//         q.add(null);

//         while(!q.isEmpty()){
//             Node currNode = q.remove();
//             if(currNode == null){
//                 System.out.println();
//                 if(q.isEmpty()) break;
//                 else q.add(null);
//             }else{
//                 System.out.print(currNode.data + " ");
//                 if(currNode.left != null) q.add(currNode.left);
//                 if(currNode.right != null) q.add(currNode.right);
//             }
//         }
    
//     }
//     public static int height1(Node root){
//         if(root == null) return 0;
//         int count = 0;
//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
//         q.add(null);
//         while(!q.isEmpty()){
//             Node currNode = q.remove();
//             if(currNode == null){
//                 count++;
//                 if(q.isEmpty()) break;
//                 else q.add(null);
//             }else{
//                 if(currNode.left != null) q.add(currNode.left);
//                 if(currNode.right != null) q.add(currNode.right);
//             }
//         }
//         return count;
//     }

//     public static int countofNode(Node root){
//         if(root == null) return 0;
//         int leftNodes = countofNode(root.left);
//         int rightNodes = countofNode(root.right);
//         return leftNodes +rightNodes+1;
//     }

//     public static int sumofNode(Node root){
//         if(root == null) return 0;
//         int leftSum = sumofNode(root.left);
//         int rightSum = sumofNode(root.right);
//         return leftSum + rightSum + root.data;
//     }

//     public static int heightofTree(Node root){
//         if(root == null) return 0;
//         int leftSum = sumofNode(root.left);
//         int rightSum = sumofNode(root.right);
//         return leftSum + rightSum + root.data;
//     }

//     public static int height2(Node root){
//         if(root == null) return 0;
//         int leftHeight = height2(root.left);
//         int rightHeight = height2(root.right);
//         int myHeight = Math.max(leftHeight,rightHeight) + 1;

//         return myHeight;
//     }

//     public static int diameter(Node root){
//         if(root == null) return 0;
//         int diam1 = diameter(root.left);
//         int diam2 = diameter(root.right);
//         int diam3 = height2(root.left)+height2(root.right)+1;
//         return Math.max(diam3, Math.max(diam1,diam2));
//     }

//     public static void main(String args[]){
//         int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);
//         System.out.println(root.data);

//         preorder(root);
//         System.out.println();
//         inorder(root);
//         System.out.println();
//         postorder(root); 
//         System.out.println();
//         levelOrder(root); 
//         System.out.println();
//         int count = countofNode(root);
//         System.out.println(count);
//         int sum = sumofNode(root);
//         System.out.println(sum);
//         int heightx = height1(root);
//         System.out.println(heightx);
//         int heighty = height2(root);
//         System.out.println(heighty);


//     }
    
// }

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees1{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BT{
        static int idx = -1;

        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    } 

    // preorder - root, left, right
    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder - left, root, right
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // postorder - left, right, root
    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // levelOrder
    public static void levelOrder(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                if(q.isEmpty()) break;
                else q.add(null);
            } else{
                System.out.print(currNode.data + " ");
                if(currNode.left != null ) q.add(currNode.left);
                if(currNode.right != null ) q.add(currNode.right);
            }
        }
    }

    // Count of Nodes
    public static int countofNode(Node root){
        if(root == null) return 0;
        int leftCount = countofNode(root.left);
        int rightCount = countofNode(root.right);
        return leftCount + rightCount +1;
    }

    // Sum of Nodes
    public static int sumofNode(Node root){
        if(root == null) return 0;
        int leftSum = sumofNode(root.left);
        int rightSum = sumofNode(root.right);
        return leftSum + rightSum + root.data;
    }

    // Height of Tree
    public static int heightofTree(Node root){
        if(root == null) return 0;
        int leftHeight = heightofTree(root.left);
        int rightHeight = heightofTree(root.right);
        int myHeight = Math.max(leftHeight,rightHeight) + 1;
        return myHeight;
    }

    // Diameter of Tree - O(N^2)
    public static int diameter(Node root){
        if(root == null) return 0;
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = heightofTree(root.left) + heightofTree(root.right)+ 1;
        return Math.max(diam3, Math.max(diam1, diam2));
    }

    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root){
        if(root == null) return new TreeInfo(0, 0);
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myheight = Math.max(left.ht, right.ht)+1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;
        int mydiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myheight, mydiam);
        return myInfo;
    }


    public static int SumofNodesatKthLevel(Node root,int k){
        if(root == null) return 0;
        int count = 0;
        int sum =0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                count++;
                if(q.isEmpty()) break;
                else q.add(null);
            }else{
                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);
                if(count == k-1){
                    sum += currNode.data;
                }
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT BinaryTree1 = new BT();
        Node root = BinaryTree1.buildTree(nodes);
        System.out.println(root.data);
        System.out.println("Pre Order");
        preorder(root);
        System.out.println();
        System.out.println("In Order");
        inorder(root);
        System.out.println();
        System.out.println("Post Order");
        postorder(root);
        System.out.println();
        System.out.println("level Order");
        levelOrder(root);
        System.out.println();
        System.out.println("Count of Nodes");
        System.out.println(countofNode(root));
        System.out.println("Sum of Nodes");
        System.out.println(sumofNode(root));
        System.out.println("Height of Tree");
        System.out.println(heightofTree(root));
        System.out.println("Diameter of Tree");
        System.out.println(diameter(root));
        System.out.println("Diameter of Tree");
        System.out.println(diameter2(root).diam);

        System.out.println("Sum of SubTree");
        System.out.println(SumofNodesatKthLevel(root,3));
    }


}
