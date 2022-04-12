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
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        if(head.next==null || head.next.next==null)
            return new int[]{-1,-1};
        int[] ret = new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE};
        int lastmaxindex=1,lastminindex=1,i=1;
        int firstcriticalindex=-1,lastcriticalindex=-1,currentcriticalindex=-1,critcount=0;
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
        critcount=1;
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
