import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/*
TASK: given a linked list, swap every two adjacent nodes (next to each other) and return its head.
You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

Example 1:
Input: head = [1,2,3,4]
Output: [2,1,4,3]

Example 2:
Input: head = []
Output: []

Example 3:
Input: head = [1]
Output: [1]

Constraints: the number of nodes in the list is in the range [0, 100] (0 <= Node.val <= 100).

Pseudo-code (analyzing and understanding the problem):
1. Iterative Approach (Time complexity: O(n)):  traverse the linked list and swap adjacent nodes while updating the connections between the pairs.
   The logic behind this approach is based on the observation that we need to swap pairs of nodes, and the iterative process can help us achieve this without recursion.
   This approach has a time complexity of O(n) because it traverses the list once, processing each pair of nodes in a single pass.
   The algorithm's efficiency comes from the fact that it only uses a constant amount of additional memory (a few pointers) and doesn't rely on recursion,
   which can cause extra overhead due to function call stack usage.
 */

// let's define ListNode Class to create nodes for the LinkedList:
public class ListNode {
    // instance variable that holds the value of the node:
    int node;

    // instance variable that is a reference to the next node in the linked list (if this is the last node in the list, its next would be null):
    ListNode adjacentNode;

    // default constructor for the ListNode Class;
    // creates a new node without initializing the node or adjacentNode variables;
    // this constructor is not used, but it's useful to have, when working with linked lists in general:
    ListNode() {}

    // parameterized constructor, that takes an integer val as an argument and initializes the node with that value.
    // the next variable remains uninitialized (i.e., it is null by default).
    ListNode(int node) { this.node = node; }

    // parameterized constructor, that takes an integer val and a reference to another ListNode called next as arguments.
    // it initializes the node with the given value and sets the next reference to the provided node.
    ListNode(int node, ListNode adjacentNode) { this.node = node; this.adjacentNode = adjacentNode; }
}

class Solution {

    public static ListNode swapPairs(ListNode head) {
        // creating a "dummy" node with the value "0":
        ListNode nodeReference = new ListNode(0);

        // setting nodeReference's next pointer to the original head of the LinkedList:
        nodeReference.adjacentNode = head;

        // initializing previous node with the nodeReference:
        ListNode prevNode = nodeReference;

        // looping until the end of the list is reached or only a single node remains unswapped:
        while (head != null && head.adjacentNode != null) {
            // assigning the first node of the pair to be swapped:
            ListNode first = head;

            // assigning the second node of the pair to be swapped:
            ListNode second = head.adjacentNode;

            // updating the previous node's next pointer to point to the second node (start of swap):
            prevNode.adjacentNode = second;

            // updating the first node's next pointer to point to the node after the second node:
            first.adjacentNode = second.adjacentNode;

            // updating the second node's next pointer to point to the first node (end of swap):
            second.adjacentNode = first;

            // moving the head pointer two nodes ahead to the next pair of nodes to be swapped:
            head = first.adjacentNode;

            // updating the previous node pointer to the first node (which is now the second node in the swapped pair)
            prevNode = first;
        }

        // returning the new head of the modified list, which is the next pointer of the dummy node
        return nodeReference.adjacentNode;
    }
}


