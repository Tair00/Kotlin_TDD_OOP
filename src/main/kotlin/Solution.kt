


  class ListNode(var `val`: Int) {
     var next: ListNode? = null
  }



  var ti = TreeNode(5)
  var v = ti.`val`

  class TreeNode(var `val`: Int) {
      var left: TreeNode? = null
     var right: TreeNode? = null }
class Solution {

    fun isSubPath(head: ListNode?, root: TreeNode?): Boolean {

        if (root == null) return false

        return checkSubPath(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right)
    }


    fun checkSubPath(head: ListNode?, node: TreeNode?): Boolean {

        if (head == null) return true

        if (node == null || head.`val` != node.`val`) return false

        return checkSubPath(head.next, node.left) || checkSubPath(head.next, node.right)
    }
}
