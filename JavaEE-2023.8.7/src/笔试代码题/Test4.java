package 笔试代码题;
//二叉树的前序遍历
//给定一个二叉树的根节点 root ，返回 它的 前序 遍历 。
import java.util.ArrayList;
import java.util.List;
/**
 * 思路：
 * 递归
 */
class TreeNode4 {
    int val;
    TreeNode4 left;
    TreeNode4 right;
    TreeNode4() {}
    TreeNode4(int val) { this.val = val; }
    TreeNode4(int val, TreeNode4 left, TreeNode4 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Test4 {
    //1.创建一个list列表来存储二叉树中的数据
    //注意：要将该列表的创建放置在方法的外部，否则就会每次迭代的时候都会重置依次列表
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode4 root) {
        //2.如果二叉树只有一个根结点，就返回空列表
        if (root == null) {
            return list;
        }
        //3.如果二叉树大于一个结点就依次遍历后放入数据
        list.add(root.val);//根
        inorderTraversal(root.left);//左
        inorderTraversal(root.right);//右
        return list;
    }
}
