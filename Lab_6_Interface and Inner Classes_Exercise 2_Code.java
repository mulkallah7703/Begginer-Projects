package programmingIIlap;
class StudentInfo {
    long ID;
    String name;
    String major;

    StudentInfo(long id, String nm, String mjr) {
        ID = id;
        name = nm;
        major = mjr;
    }

    void printStudentInfo() {
        System.out.println("Stu ID : " + ID + "\nName : " + name + "\nMajor : " + major);
    }

    class Contact {  // inner class starts here
        String phone;
        String email;
        String postal;

        Contact(String ph, String eml, String pst) {
            phone = ph;
            email = eml;
            postal = pst;
        }
        public void printContact() {
            System.out.println("Phone : " + phone + "\nEmail : " + email + "\nAddress : " + postal);
        }
    } // end of inner class
} // end of outer class



public class InnerTestApp {
	 public static void main(String args[]) {
	        // Single object example
	        long id = 2019;
	        String nm = "Ahmed";
	        String mjr = "SE";
	        String ph = "056-1234567";
	        String eml = "ahmed@gmail.com";
	        String pst = "Hafr Al Batin";

	        System.out.println("\n [ Single object example ] \n");
	        StudentInfo obj = new StudentInfo(id, nm, mjr);
	        StudentInfo.Contact in = obj.new Contact(ph, eml, pst);
	        obj.printStudentInfo();
	        in.printContact();

	        System.out.println("\n [ Array of objects example ] \n");

	        StudentInfo[] objAry = new StudentInfo[2];
	        StudentInfo.Contact[] inAry = new StudentInfo.Contact[2];

	        for (int i = 0; i < 2; i++) {
	        	  // Values can be input from user and then plugged into constructors
	            objAry[i] = new StudentInfo(id + i, nm, mjr);
	            inAry[i] = objAry[i].new Contact(ph + i, eml, pst); // if different
	        }

	        for (int i = 0; i < 2; i++) { // Display the values for two students in array
	            objAry[i].printStudentInfo();
	            inAry[i].printContact();
	            System.out.println(); // for new line
	        }
	    }
	} 
	        



