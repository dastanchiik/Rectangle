public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setCm1(12);
        rectangle.setCm2(10);
        rectangle.setCm3(12);
        rectangle.setCm4(10);
        System.out.println("A: "+rectangle.getCm1()+"\n"+"B: "+rectangle.getCm2()+"\n"+"c: "+rectangle.getCm3()+"\n"+"c: "+rectangle.getCm4());
        square(rectangle.getCm1(), rectangle.getCm2());

    }
        public static void square(int a,int b){
            System.out.println(a*b);
        }
}