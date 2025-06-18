package programmingIIlap;
import java.lang.*;
interface Area {
    final static double pt = 3.14;
    double compute(double x, double y);
}

class rectangle implements Area {
    public double compute(double a, double b) {
        return a * b;
    }
}

class circle implements Area {
    public double compute(double a, double b) {
        return pt * a * a;
    }
}

class triangle implements Area {
    public double compute(double base, double height) {
        return 0.5 * base * height;
    }
}




public class interfaceDemo {
	 public static void main(String[] args) {
	        rectangle rect = new rectangle();
	        circle cir = new circle();
	        triangle tri = new triangle(); // إنشاء كائن من فئة triangle

	        Area A;
	        A = rect;
	        System.out.println("Area of rectangle=" + A.compute(10, 20));

	        A = cir;
	        System.out.println("Area of circle=" + A.compute(10, 0));

	        A = tri;
	        System.out.println("Area of triangle=" + A.compute(10, 5));; // استدعاء طريقة compute لفئة triangle
	}
	}


