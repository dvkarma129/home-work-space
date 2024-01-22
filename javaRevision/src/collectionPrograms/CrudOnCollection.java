package collectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class crud {
    int eId;
    String eName;
    int eSalary;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteSalary() {
        return eSalary;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }

    public crud(int eId, String eName, int eSalary) {
        this.eId = eId;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    @Override
    public String toString() {
        return "eId= " + eId + ", eName= " + eName + ", eSalary=" + eSalary;
    }

}

public class CrudOnCollection {

    public static void main(String[] args) {
        List<crud> c = new ArrayList<crud>();
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Press 1: Insert");
            System.out.println("Press 2: Display");
            System.out.println("Press 3: Search");
            System.out.println("Press 4: Delete");
            System.out.println("Press 5: Update");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter ID");
                    int eId = sc.nextInt();
                    System.out.println("Enter name");
                    String eName = sc.next();
                    System.out.println("Enter Salary");
                    int eSalary = sc.nextInt();

                    c.add(new crud(eId, eName, eSalary));

                    break;

                case 2:
                    Iterator<crud> i = c.iterator();
                    while (i.hasNext()) {
                        crud cr = i.next();
                        System.out.println(cr);
                    }

                    break;

                case 3:
                    Boolean found = false;
                    System.out.println("Enter emp no");
                    int empNo = sc.nextInt();
                    i = c.iterator();
                    while (i.hasNext()) {
                        crud cr = i.next();
                        if (empNo == cr.geteId()) {
                            System.out.println(cr);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Not find");
                    }

                    break;

                case 4:
                    found = false;
                    System.out.println("Enter emp no to delete");
                    empNo = sc.nextInt();
                    i = c.iterator();
                    while (i.hasNext()) {
                        crud cr = i.next();
                        if (empNo == cr.geteId()) {
                            i.remove();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Not find");
                    } else {
                        System.out.println("Deleted succesfully");
                    }

                    break;

            }
        } while (n != 0);
    }

}
