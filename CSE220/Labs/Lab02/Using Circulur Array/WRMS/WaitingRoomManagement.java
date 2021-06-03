/*
 * Name : Sanjib Kumar Sen 
 * ID: 19301101 
 * Lab and Theory Section: 01 (JNM)
 * 
 * github: https://github.com/sanjib-sen
 * 
 */

public class WaitingRoomManagement {
    Patient data[];
    int start;
    int size;
    int id;
    int total = 10;

    // This method will create a Circulur Array of 100 length consisting Patient
    // informations.
    public WaitingRoomManagement() {
        data = new Patient[total];
        start = 0;
        size = 0;
        id = 100;
    }

    // This method assigns an Id to a patient and register him/her to the system.
    public void registerPatient(Patient p) {
        if (size == data.length) {
            System.out.println("Failed to Register new Patient. Database Length exceeded.");
            return;
        } else {
            p.id = id;
            id++;
            data[(start + size) % data.length] = p;
            size++;
        }
        System.out.println("Success Registering " + p.name + " (" + p.age + ")");
    }

    // This method calls a patient to provide hospital service to him/her and show
    // his name.
    public Patient servePatient() {
        if (size == 0) {
            System.out.println("No more patient left");
            return null;
        } else {
            Patient pat = (Patient) data[start];
            data[start] = null;
            start = (start + 1) % data.length;
            size--;
            return pat;
        }
    }

    // This method is for showing all registered patient by their IDs.
    // This method will show the patients in Queue Order.
    // This method is not a part of the lab grading assesment/task.
    public void showRegistered() {
        int current = start;
        if (size == 0) {
            System.out.println("No more patient left");
            return;
        }
        for (int i = 0; i < size; i++, current = (current + 1) % data.length) {
            System.out.println(data[current].name + " --> " + data[current].id);
        }

    }

    // This method will return true if there's no patient left for hospital service.
    public boolean canDoctorGoHome() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    // This method shows all ids of the waiting patients in SORTED(Name) order.
    public void showAllPatient() {
        if (size == 0) {
            System.out.println("No more patient left");
            return;
        }

        Patient[] datacopy = new Patient[size];

        for (int i = 0, strt = start; i < size; i++, strt++) {
            datacopy[i] = data[strt];
        }

        int curr = 0;
        for (int j = 0; j < size - 1; j++) {
            for (int i = 0; i < size - j - 1; i++, curr++) {
                Patient cur = datacopy[curr];
                Patient next = datacopy[curr + 1];
                if (Compare(cur.name, next.name)) {
                    Patient temp = datacopy[curr];
                    datacopy[curr] = datacopy[curr + 1];
                    datacopy[curr + 1] = temp;
                }
            }
            curr = 0;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(datacopy[i].id + " --> " + datacopy[i].name);
        }
    }

    // This method cancels all appointments of the patients
    public void cancelAll() {
        if (size == 0) {
            System.out.println("Cancelling failed. No more patient left");
            return;
        }
        int temp = size;
        for (int i = 0; i < temp; i++) {
            data[start] = null;
            start = (start + 1) % data.length;
            size--;
        }
        System.out.println("Cancelling Success.");
    }

    // This method is used to compare 2 strings for sorting in showAllPatient
    // method.
    // This method is not a part of the lab grading assesment/task.
    public static boolean Compare(String p, String q) {
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

}