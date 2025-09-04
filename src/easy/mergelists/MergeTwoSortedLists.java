package easy.mergelists;


public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //Primero antes que nada gaurdamos la referencia de el primer nodo para no perderse
        ListNode primerNodo = null;
        ListNode nodo = new ListNode(0);

        ListNode listaPrincipal = new ListNode(0);

        while (list1.next != null && list2 != null) {

            if (list1.next != null && list1.val >= list2.val) {
                nodo.val = list1.val;
                list1 = list1.next;

            } else if (list2.next != null) {
                nodo.val = list2.val;
                list2 = list2.next;

            }

            if (listaPrincipal == null && listaPrincipal.next == null) {

                listaPrincipal = listaPrincipal.next;
                listaPrincipal.next = nodo;

            } else {
                listaPrincipal = nodo;
                primerNodo = nodo;
            }

        }

        return primerNodo;

    }

    static void printList(ListNode head) {
        for (ListNode cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.val);
            if (cur.next != null) System.out.print(" -> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // list1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        // list2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.print("List1: ");
        printList(list1);
        System.out.print("List2: ");
        printList(list2);

        ListNode merged = mergeTwoLists(list1, list2);

        System.out.print("Merged: ");
        printList(merged);
    }
}
