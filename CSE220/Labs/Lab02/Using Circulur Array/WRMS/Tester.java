/*
 * Name : Sanjib Kumar Sen 
 * ID: 19301101 
 * Lab and Theory Section: 01 (JNM)
 */

public class Tester {
    public static void main(String[] args) {
        WaitingRoomManagement wrm = new WaitingRoomManagement();
        Patient p1 = new Patient("DBobb", 15, "B+");
        Patient p2 = new Patient("CBoba", 19, "AB+");
        Patient p3 = new Patient("Veena", 33, "O+");
        Patient p4 = new Patient("Alita", 21, "A");
        wrm.registerPatient(p1);
        wrm.registerPatient(p2);
        wrm.registerPatient(p3);
        wrm.registerPatient(p4);

        System.out.println("\nList of Registered Patients: ");
        wrm.showRegistered();
        System.out.println();
        System.out.println(wrm.servePatient().name + " is being served.");
        System.out.println(wrm.servePatient().name + " is being served.");
        // System.out.println(wrm.servePatient().name + " is being served.");
        // System.out.println(wrm.servePatient().name + " is being served.");
        System.out.println("\nIDs' of waiting Patients ");
        wrm.showAllPatient();
        if (wrm.canDoctorGoHome()) {
            System.out.println("\nYes, Doctor can go home now.");
        } else {
            System.out.println("\nNo, Doctor can't go home now.");
        }
        System.out.println("\nCancelling all appointments...");
        wrm.cancelAll();
        if (wrm.canDoctorGoHome()) {
            System.out.println("\nYes, Doctor can go home now.");
        } else {
            System.out.println("\nNo, Doctor can't go home now.");
        }
    }
}