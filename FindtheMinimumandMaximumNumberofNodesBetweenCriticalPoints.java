/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


/*
Idea is to iterate the linked list from second to last but 1 node, and check if the node is critical.

The maximum distance would be between first and last critical node.

Minimum distance is what would vary, so maintain a last critical index position, and current critical index position.

*/
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        if(head.next==null || head.next.next==null)
            return new int[]{-1,-1};
        int[] ret = new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE};
        int lastmaxindex=1,lastminindex=1,i=1;
        int firstcriticalindex=-1,lastcriticalindex=-1,currentcriticalindex=-1;
        ListNode prev = head;
        head=head.next;
        while(head.next!=null && !isCritical(head,prev))
        {
            prev=head;
            head=head.next;
            i++;
        }
        firstcriticalindex = i;
        lastcriticalindex = i;
        currentcriticalindex=i;
        if(head.next==null)
        return new int[]{-1,-1};
        prev=head;
        head=head.next;
        i++;
        while(head.next!=null)
        {
            
            if(isCritical(head,prev))
            {
                currentcriticalindex=i;
                ret[0]=Math.min(ret[0],Math.abs(lastcriticalindex-currentcriticalindex));
                ret[1]=Math.abs(firstcriticalindex-i);
            }
            lastcriticalindex=currentcriticalindex;
            i++;
            prev=head;
            head=head.next;
        }
        if(firstcriticalindex!=lastcriticalindex)
        return ret;
        else
            return new int[]{-1,-1};
    }
    public static boolean isCritical(ListNode head,ListNode prev)
    {
        if((head.val>head.next.val && head.val>prev.val) || (head.val<head.next.val && head.val<prev.val))
            return true;
        return false;
    }
}
