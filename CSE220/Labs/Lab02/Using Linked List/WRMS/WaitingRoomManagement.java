/*
 * Name : Sanjib Kumar Sen 
 * ID: 19301101 
 * Lab and Theory Section: 01 (JNM)
 * 
 * github: https://github.com/sanjib-sen
 * 
 */

/**
 * Linked List Type Used: Dummy Headed Circulur Linked List
 */
public class WaitingRoomManagement {
    Node head, prev;
    int size;
    int id;
    int total = 10; // Can be modified

    // This method will create a Circulur Array of 10 length consisting Patient
    // informations.
    public WaitingRoomManagement() {
        head = new Node(null, null, null);
        prev = new Node(null, null, null);
        head.next = head.prev = head;
        size = 0;
        id = 100;
    }

    // This method assigns an ID to a patient and register him/her to the system.
    public void registerPatient(Patient p) {
        Node n = new Node(p, head, null);
        head.prev = n;
        if (size == 0) {
            n.prev = head;
            head.next = n;
        } else {
            n.prev = prev;
            prev.next = n;
        }
        prev = n;
        p.id = id;
        id++;
        size++;
        System.out.println("Success Registering " + p.name + " (" + p.age + ")");
    }

    // This method is for showing all registered patient by their IDs.
    // This method will show the patients in Queue Order.
    // This method is not a part of the lab grading assesment/task.
    public void showRegistered() {
        if (size == 0) {
            System.out.println("No more patient left");
            return;
        }
        for (Node p = head.next; p != head; p = p.next) {
            System.out.println(p.patient.name + " --> " + p.patient.id);
        }
    }

    // This method calls a patient to provide hospital service to him/her and show
    // his name.
    public Patient servePatient() {
        if (size == 0) {
            System.out.println("No more patient left");
            return null;
        } else {
            Node delete = head.next;
            Node pat = delete.next;
            pat.prev = head;
            head.next = pat;
            delete.next = null;
            delete.prev = null;
            size--;
            return delete.patient;
        }
    }

    // This method will return true if there's no patient left for hospital service.
    public boolean canDoctorGoHome() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    // This method cancels all appointments of the doctors
    public void cancelAll() {
        if (size == 0) {
            System.out.println("Cancelling failed. No more patient left");
            return;
        }
        for (Node delete = head.next; delete != head;) {
            delete.patient = null;
            delete.prev = null;
            Node temp = delete.next;
            delete.next = null;
            delete = temp;
            size--;
        }
        System.out.println("Cancelling Success.");
    }

    // This method shows all ids of the waiting patients in SORTED(Name) order.
    public void showAllPatient() {
        if (size == 0) {
            System.out.println("No more patient left");
            return;
        }
        Node copy = sortList(head);
        for (Node p = copy.next; p != copy; p = p.next) {
            System.out.println(p.patient.id + " --> " + p.patient.name);
        }
    }

    // This method is used to compare 2 strings for sorting in showAllPatient
    // method.
    // This will return true if the first string is larger than second.
    // This method is not a part of the lab grading assesment/task.
    public static boolean compare(String p, String q) {
        String s, t;
        if (p.length() < q.length()) {
            s = p;
            t = q;
        } else {
            s = q;
            t = p;
        }
        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) == t.charAt(i)) {
                continue;
            } else if ((int) s.charAt(i) > t.charAt(i)) {
                return false;
            } else if ((int) s.charAt(i) < t.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    // This method is for copying a Linked List.
    // This method is useful for showAll and sortNode nmethod.
    // This method is not a part of the lab grading assesment/task.
    public Node copyList(Node source) {
        Node dest = new Node(null, null, null);
        dest.next = dest.prev = dest;
        Node prev = dest;
        for (Node s = source.next; s != source; s = s.next) {
            Node copy = new Node(s.patient, dest, prev);
            prev.next = copy;
            dest.prev = copy;
            prev = copy;
        }
        return dest;
    }

    // This method is for sorting a linked list.
    // This method is useful for showAll method.
    // This method is not a part of the lab grading assesment/task.
    public Node sortList(Node source) {
        Node dest = copyList(source);
        for (int i = 0; i < size - 1; i++) {
            Node node = dest.next;
            for (; node.next != dest; node = node.next) {
                Patient current = node.patient;
                Patient next = node.next.patient;
                if (compare(current.name, next.name)) {
                    Node curNode = new Node(next, null, node.prev);
                    Node nextNode = new Node(current, node.next.next, curNode);
                    curNode.next = nextNode;
                    node.next.next.prev = nextNode;
                    node.prev.next = curNode;
                }
            }
        }

        return dest;
    }

}