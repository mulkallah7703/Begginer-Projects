package programmingIIlap;
public class Sample<T1, T2> {
    private T1 data;
    private T2 info;

    Sample() {
        data = null;
        info = null;
    }


public void setDataInfo(T1 d, T2 s) {
	 data = d;
     info = s;
 }

 public void printAsString() {
     System.out.println(data + " " + info);
 }

 public static void main(String args[]) {
     Sample<Double, String> obj1 = new Sample<Double, String>();
     obj1.setDataInfo(2.5, "Ahmed");
     System.out.print("Object 1 = ");
     obj1.printAsString();

     Sample<String, Integer> obj2 = new Sample<String, Integer>();
     obj2.setDataInfo("Qasim", 42);
     System.out.print("Object 2 = ");
     obj2.printAsString();
}

}


