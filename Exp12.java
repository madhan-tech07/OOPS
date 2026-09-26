import java.io.*;

public class reservation { 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    static int pno[] = new int[275];
    static String name[] = new String[275];
    static String phno[] = new String[275];
    static int age[] = new int[275];
    static int cl[] = new int[275];
    static int pcount = 0;
    static int pnum = 1;
    static int max1 = 75;  // AC class available
    static int max2 = 125; // First class available
    static int max3 = 175; // Sleeper class available

    public static void main(String[] args) throws Exception {
        doMenu();
    }

    public static void doMenu() throws Exception {
        int cho = 0;
        do {
            System.out.println();
            doHeading();
            System.out.println("1. Book ticket");
            System.out.println("2. Cancel ticket");
            System.out.println("3. Search passenger");
            System.out.println("4. Reservation chart");
            System.out.println("5. Display unbooked tickets");
            System.out.println("6. Exit");
            System.out.println("Please enter your choice:");
            cho = Integer.parseInt(br.readLine());

            switch (cho) {
                case 1:
                    doBook();
                    break;
                case 2:
                    doCancel();
                    break;
                case 3:
                    doSearch();
                    break;
                case 4:
                    doDispList();
                    break;
                case 5:
                    doDispUnbooked();
                    break;
                case 6:
                    doExit();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (cho != 6);
    }

    private static void doHeading() {
        System.out.println("=== Railway Reservation For Kabul Express ===");
    }

    private static void doBook() throws Exception {
        System.out.println("Please enter the class of ticket");
        System.out.println("1. AC\t 2. First\t 3. Sleeper");
        int c = Integer.parseInt(br.readLine());
        System.out.println("Please enter no. of tickets");
        int t = Integer.parseInt(br.readLine());

        boolean ticketAvailable = false;
        if (c == 1 && max1 >= t) {
            ticketAvailable = true;
        } else if (c == 2 && max2 >= t) {
            ticketAvailable = true;
        } else if (c == 3 && max3 >= t) {
            ticketAvailable = true;
        }

        if (ticketAvailable) {
            for (int i = 0; i < t; i++) {
                pno[pcount] = pnum;
                System.out.println("\nPassenger " + (i + 1) + ":");
                System.out.println("Please enter your name:");
                name[pcount] = br.readLine();
                System.out.println("Please enter your age:");
                age[pcount] = Integer.parseInt(br.readLine());
                cl[pcount] = c;
                System.out.println("Please enter your phone no:");
                phno[pcount] = br.readLine();
                pcount++;
                pnum++;
            }

            if (c == 1) {
                max1 -= t;
                System.out.println("Ticket(s) successfully booked. Please pay Rs. " + (t * 1500));
            } else if (c == 2) {
                max2 -= t;
                System.out.println("Ticket(s) successfully booked. Please pay Rs. " + (t * 1200));
            } else if (c == 3) {
                max3 -= t;
                System.out.println("Ticket(s) successfully booked. Please pay Rs. " + (t * 1000));
            }
        } else {
            System.out.println("Sorry, requested number of tickets not available for this class.");
        }
    }

    private static void doCancel() throws Exception {
        int t_pno[] = new int[275];
        String t_name[] = new String[275];
        String t_phno[] = new String[275];
        int t_age[] = new int[275];
        int t_cl[] = new int[275];
        int t_pcount = 0;
        boolean passengerFound = false;

        System.out.println("Please enter your passenger no.:");
        int p = Integer.parseInt(br.readLine());

        for (int i = 0; i < pcount; i++) {
            if (pno[i] != p) {
                t_pno[t_pcount] = pno[i];
                t_name[t_pcount] = name[i];
                t_phno[t_pcount] = phno[i];
                t_age[t_pcount] = age[i];
                t_cl[t_pcount] = cl[i];
                t_pcount++;
            } else {
                passengerFound = true;
                if (cl[i] == 1) {
                    max1++;
                    System.out.println("Please collect refund of Rs. 1500");
                } else if (cl[i] == 2) {
                    max2++;
                    System.out.println("Please collect refund of Rs. 1200");
                } else if (cl[i] == 3) {
                    max3++;
                    System.out.println("Please collect refund of Rs. 1000");
                }
            }
        }

        if (passengerFound) {
            pno = t_pno;
            name = t_name;
            age = t_age;
            cl = t_cl;
            phno = t_phno;
            pcount = t_pcount;
            System.out.println("Ticket successfully cancelled.");
        } else {
            System.out.println("Passenger not found.");
        }
    }

    private static void doDispList() {
        System.out.println("\n--- Passenger list in AC class ---");
        System.out.println("PNo\tName\t\tAge\tPhNo");
        for (int i = 0; i < pcount; i++) {
            if (cl[i] == 1) {
                System.out.println(pno[i] + "\t" + name[i] + "\t\t" + age[i] + "\t" + phno[i]);
            }
        }

        System.out.println("\n--- Passenger list in First class ---");
        System.out.println("PNo\tName\t\tAge\tPhNo");
        for (int i = 0; i < pcount; i++) {
            if (cl[i] == 2) {
                System.out.println(pno[i] + "\t" + name[i] + "\t\t" + age[i] + "\t" + phno[i]);
            }
        }

        System.out.println("\n--- Passenger list in Sleeper class ---");
        System.out.println("PNo\tName\t\tAge\tPhNo");
        for (int i = 0; i < pcount; i++) {
            if (cl[i] == 3) {
                System.out.println(pno[i] + "\t" + name[i] + "\t\t" + age[i] + "\t" + phno[i]);
            }
        }
    }

    private static void doSearch() throws Exception {
        boolean passengerFound = false;
        System.out.println("Please enter passenger no. to search:");
        int p = Integer.parseInt(br.readLine());

        for (int i = 0; i < pcount; i++) {
            if (pno[i] == p) {
                System.out.println("Details found:");
                passengerFound = true;
                System.out.println("Passenger No: " + pno[i]);
                System.out.println("Name: " + name[i]);
                System.out.println("Class: " + cl[i]);
                System.out.println("Phone No: " + phno[i]);
                System.out.println("Age: " + age[i]);
            }
        }

        if (!passengerFound) {
            System.out.println("No such passenger found.");
        }
    }

    private static void doDispUnbooked() {
        System.out.println("\n--- Available Tickets Status ---");
        System.out.println("AC Class: " + max1);
        System.out.println("First Class: " + max2);
        System.out.println("Sleeper Class: " + max3);
    }

    private static void doExit() {
        System.out.println("Thank you for using the Railway Reservation System!");
    }
}