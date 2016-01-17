// java中的函数也叫方法 方法的逻辑意义代表的就是一个事物可以执行的操作
class Triangle{
    double a;
    double b;
    double c;
// 不需要定义形参,因为周长函数和属性abc是一个有机的整体 彼此当然可以相互访问
    double perimetre()
    {
        return a+b+c;
    }
    double aire()
    {
        double p =0.5*(a + b + c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}

public class Main {

    public static void main(String[] args) {
        Triangle s = new Triangle();
        s.a = 3.0;
        s.b = 4.0;
        s.c = 5.0;
        //		int i;
//
//		int * p = (int *)malloc(sizeof(int));
//		A * q = (A *)malloc(sizeof(A));
//
//
//		Triangle * r = (Triangle * )malloc(sizeof(Triangle));

//        在java中double和float都用%f输出
        System.out.printf("%g   %g\n", s.perimetre(), s.aire());
    }
}
