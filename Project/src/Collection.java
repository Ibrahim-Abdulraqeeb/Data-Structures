import java.util.ArrayList;
import java.util.Scanner;


public class Collection {


    private DoubleLinkedList<Reservation> rev2 ;
    DoubleLinkedList<Room> room2 ;
    DoubleLinkedList<Customer> customer2 ;
    private ArrayList<Employee> employee ;
    private DoubleLinkedList<Employee> employee2 ;

    public Collection() {
        rev2 = new DoubleLinkedList<>();
        room2 = new DoubleLinkedList<>();
        customer2 =new DoubleLinkedList<>();
        employee = new ArrayList<Employee>();
        employee2 = new DoubleLinkedList<>();
    }

    public boolean add_Room(Room b)
    {

        room2.Add_Last(b);
        return true ;
    }

    public void display_Empty_R()
    {
        System.out.println("Room_ID"+"    "+"Room_Status");
        System.out.println("_____________________________");
        int x = room2.getSize();
        for (int j=0; j<x; j++)
        {
            if (room2.first().getStatus()=='y'){
                System.out.println(" r "+room2.first().getR_id()+"   " +
                        "           "+room2.first().getStatus());
            }
            room2.Add_Last(room2.Remove_First());

        }



    }

    public void search_Room(String x)
    {
        System.out.println("Room_ID"+"    "+"Room_Status");
        System.out.println("_____________________________");
        int e = room2.getSize();
        for (int i = 0; i <e ; i++) {
            if (x==room2.first().getR_id())
            {
                System.out.println("  "+room2.first().getR_id()+"              "+room2.first().getStatus());
                break ;
            }
            room2.Add_Last(room2.Remove_First());
        }
    }

    public void displayAllRooms()
    {
        System.out.println("Room_ID"+"    "+"Room_Status"+"    "+"    Floor"+"         " +
                "   "+"price");
        System.out.println("______________________________________________________");
        int x =rev2.getSize();
        int z =room2.getSize();
        for (int i = 0; i <z ; i++) {

            for (int j=0; j<x ; j++) {
                String y =rev2.first().getR().getR_id();
                if(room2.first().getR_id()==y)
                {
                    room2.first().setStatus('n');
                }

            }
            System.out.println(room2.first()+"\n");
            rev2.Add_Last(rev2.Remove_First());
            room2.Add_Last(room2.Remove_First());
        }
    }

    public void searchCustomer(String phone)
    {
        int p=0;
        String x ;
        int z = customer2.getSize();
        for (int i = 0; i <z ; i++) {
            x=customer2.first().getPhone();
            if (phone.equals(x))
            {
                System.out.println("The Customer is already in the System");
                break ;
            }
            p++;
            customer2.Add_Last(customer2.Remove_First());
        }
        if (p==z)
        {
            System.out.println("The Customer is not in the System");
        }
    }

    public boolean addReservation(Reservation reservation)
    {   rev2.Add_First(reservation);
        return true ;
    }

    public void displayAllReservation()
    {
        System.out.println("==============================================================================" +
                "=========================================================================================" +
                "=========");
        System.out.printf("%-10s%24s%22s%21s%23s%22s%22s%28s","Customer_name","social_status","Room_num"
                ,"Payment","Period","Rest_of_pay","Total","Reservation Date");
        System.out.println();
        System.out.println("==============================================================================" +
                "=========================================================================================" +
                "=========");
        int x = rev2.getSize();
        for (int i = 0; i <x ; i++) {
            System.out.println(rev2.first());
            rev2.Add_Last(rev2.Remove_First());
        }
    }

    public boolean addCustomer(Customer c)
    {
        customer2.Add_First(c);
        return true ;
    }

    public boolean addEmployee(Employee e)
    {
        employee2.Add_First(e);
        return true ;
    }

    public void displayAllEmployees()
    {
        System.out.println(" Name                         ID                   PhoneNum               Salary");
        System.out.println("===================================================================================================");
        int z = employee2.getSize();
        for (int i = 0; i <z ; i++) {
            System.out.println(employee2.first());
            employee2.Add_Last(employee2.Remove_First());
        }
    }

    public void searchForEmployee(String id)
    {
        System.out.println(" Name                ID                   PhoneNum                Salary");
        System.out.println("==============================================================================");
        int z = employee2.getSize();
        for (int i = 0; i <z ; i++) {
            String x = employee2.first().getId() ;
            if (id.equals(x))
            {
                System.out.println(employee2.first());
                break ;
            }
            employee2.Add_Last(employee2.Remove_First());
        }
    }

    public boolean RemoveEmployee(String id )
    {
        int z = employee2.getSize();
        for (int i = 0; i <z ; i++) {
            String x = employee2.first().getId();
            if(x.equals(id))
            {
                employee2.Remove_First();
                System.out.println("\nRemoved Successfully\n");
                return true ;
            }
            employee2.Add_Last(employee2.Remove_First());
        }
        return false ;
    }

    public void EditRes(String name)
    {
        String x = null, y ,o;
        int sz = rev2.getSize();

        for (int i = 0; i <sz ; i++) {
            o=rev2.first().getC().getName();
            Scanner in = new Scanner(System.in);
            int choice ;
            if (name.equals(o))
            {
                System.out.println("\t\t\t\t\tEnter your choice :");
                System.out.println("1)Edit Payment ");
                System.out.println("2)Remove Reservation ");
                System.out.println("3)Edit Period ");
                choice = in.nextInt();
                if(choice==1)
                {
                    System.out.println("Edit payment , Enter the payment : ");
                    double p =in.nextDouble(), q ;
                    q=rev2.first().getPayment()+p;
                    rev2.first().setPayment(q);
                    break ;
                }
                else if(choice==2)
                {
                    int z=0;
                    char p ='y';
                    String m , n ;
                    int t = room2.getSize();
                    for (int j = 0; j < t; j++) {
                        m=room2.first().getR_id() ;
                        n=rev2.first().getR().getR_id();
                        if (m.equals(n))
                        {
                            room2.first().setStatus(p);
                        }
                        room2.Add_Last(room2.Remove_First());
                    }
                    rev2.Remove_First();
                    System.out.println("Removed");
                    break;
                }
                if (choice==3)
                {
                    System.out.println("Current period in Reservation is ( "+rev2.first().getPeriod()+" ) Enter Additional period :");
                    int w = in .nextInt()  ;
                    int v= rev2.first().getPeriod();
                    int p = w+v;
                    rev2.first().setPaired(w);
                }
            }
            if(i==sz)
            {
                System.out.println("There is no reservation for this name .");
            }
            rev2.Add_Last(rev2.Remove_First());
        }
    }

    public void dispalyAllCustomers()
    {
        System.out.println("  "+"Name"+"               "+"Identification"+"             "+"Phone" +
                ""+"           "+"  Social Status");
//        System.out.printf("%-10s%20s%15s%27s","Name "," Identification "," Phone "," Social Status");
//        System.out.println();
        System.out.println("================================================================================================");
        int x = customer2.getSize();
        for (int i = 0; i < x ; i++)
        {
            System.out.println(customer2.first());
            customer2.Add_Last(customer2.Remove_First());
        }
    }

}
