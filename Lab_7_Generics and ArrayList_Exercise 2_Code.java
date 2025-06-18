package programmingIIlap;
import java.util.*;


public class MyArrayListApp {
	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner inpInt = new Scanner(System.in);
        Scanner inpString = new Scanner(System.in);

        while (true) {
            System.out.println("Friends List: \n1.Add\n2.Delete\n3.Search\n4.Edit\n5.Show List\n6.Exit");
            int option = inpInt.nextInt();

            if (option == 1) {
                System.out.println("Enter the new name to add:");
                list.add(inpString.nextLine());
            } 
            else if (option == 2) {
                System.out.println("Enter number from 1 - " + list.size() + " to be deleted");
                int d = inpInt.nextInt();
                if (d > 0 && d <= list.size()) {
                    list.remove(d - 1);
                } else {
                	 System.out.println("You did not enter a number from 1 - " + list.size() + " to be deleted");
                }
            } 
            else if (option == 3) {
                System.out.println("Enter a name to search:");
                String q = inpString.nextLine();
                if (list.contains(q)) {
                    System.out.println(q + " IS in the list");
                } else {
                    System.out.println(q + " IS NOT in the list");
                }
            } 
            else if (option == 4) {
                System.out.println("Enter number from 1 - " + list.size() + " to be Edited:");
                int d = inpInt.nextInt();
                if (d > 0 && d <= list.size()) {
                    System.out.println("Enter the name to replace " + list.get(d - 1) + ":");
                    String q = inpString.nextLine();
                    list.set(d - 1, q);
                } else {
                	System.out.println("You did not enter a number from 1 - " + list.size() + " to be edited");
                }
            } 
            else if (option == 5) {
                System.out.println("***** Here is the list *****");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
                System.out.println("");
            } 
            else if (option == 6) {
                return;
            } 
            else {
                System.out.println("Wrong choice...");
                }
}
        }
}




