/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackintreview;

   

/**
 *
 * @author Victor
 */
public class Node {
    int data;
    Node left;
    Node right;
        
    public static void main(String[] args) {
       Node n1 = new Node();
       n1.data=1;
       Node n2 = new Node();
       n2.data=2;
       Node n3 = new Node();
       n3.data=3;
       
       n2.left=n1;
       n2.right=n3;
       
       System.out.println(checkBST(n3));
       
               

    }
    
    static boolean checkBST(Node root) {
        boolean bol_left=true;
        boolean bol_right=true;
        if(root.left!=null){
            if(root.left.data < root.data){
                bol_left=checkBST(root.left);
            }else{
                return false;
            }
        }
        
        if(root.right!=null){
            if(root.right.data > root.data){
               bol_right=checkBST(root.right);
            }else{
                return false;
            }
        }
        
        return bol_left&&bol_right;
            
    }
    
}

