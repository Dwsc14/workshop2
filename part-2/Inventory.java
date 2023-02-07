import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    public static List<Guitar> ListofGuitar = new ArrayList<Guitar>();

    public static void main(String[] args) {
        String serialNo;
        int choice;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add guitar\n2.Sreach Guitar");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                addGuitar();
            } else if (choice == 2) {
                serialNo = sc.nextLine();
                sreachGuitar(serialNo);
            } else {
                break;
            }
        }
    }

    public static void addGuitar() {
        Guitar gui = new Guitar();
        gui.setInfo();
        ListofGuitar.add(gui);
    }

    public static void sreachGuitar(String serialNo) {
        boolean access = true;
        for (int i = 0; i < ListofGuitar.size(); i++) {
            if (ListofGuitar.get(i).getSerialNumber().equals(serialNo)) {
                ListofGuitar.get(i).getInfo();
                access = false;
            }
        }
        if (access) {
            System.out.println("Couldn't find a guitar with this serial");
        }
    }

}
