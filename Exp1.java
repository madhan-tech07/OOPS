import java.util.Scanner;

public class ElectBill
{
    public static void main(String[] args)
    {
        consumer ob = new consumer();

        ob.Getdata();
        ob.Calc();
        ob.Display();
    }
}

class consumer
{
    Scanner in = new Scanner(System.in);

    int cno;
    String cname, type_of_conn;
    double pre_reading, curr_reading, unit_consumed, tbill;

    void Getdata()
    {
        System.out.print("\nEnter consumer number = ");
        cno = in.nextInt();
        in.nextLine();   // Clear input buffer

        System.out.print("Enter consumer name = ");
        cname = in.nextLine();

        System.out.print("Enter the type of connection = ");
        type_of_conn = in.nextLine();

        System.out.print("Enter previous month reading = ");
        pre_reading = in.nextDouble();

        System.out.print("Enter current month reading = ");
        curr_reading = in.nextDouble();
    }

    void Calc()
    {
        unit_consumed = curr_reading - pre_reading;

        if (type_of_conn.equalsIgnoreCase("domestic"))
        {
            if (unit_consumed <= 100)
                tbill = 1 * unit_consumed;
            else if (unit_consumed <= 200)
                tbill = 2.50 * unit_consumed;
            else if (unit_consumed <= 500)
                tbill = 4 * unit_consumed;
            else
                tbill = 6 * unit_consumed;
        }
        else if (type_of_conn.equalsIgnoreCase("commercial"))
        {
            if (unit_consumed <= 100)
                tbill = 2 * unit_consumed;
            else if (unit_consumed <= 200)
                tbill = 4.50 * unit_consumed;
            else if (unit_consumed <= 500)
                tbill = 6 * unit_consumed;
            else
                tbill = 7 * unit_consumed;
        }
    }

    void Display()
    {
        System.out.println("\nConsumer Name = " + cname);
        System.out.println("Total Units = " + unit_consumed);
        System.out.println("Total Bill = Rs " + tbill);
    }
}
