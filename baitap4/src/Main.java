public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Double bankinh = circle.getArea();
        String str = circle.getdisplay();
        double chuvi = circle.circle(bankinh);
        System.out.println("ban kinh "+ "\t" + bankinh + "\n" +"chu vi"+"\t" + chuvi +"\n"+ str) ;

        System.out.println("--------------------------------------------------------------");

        Rectangle rect = new Rectangle();
        double witch = rect.getArea();
        String str1 =  rect.getdisplay();
        int dintich = rect.dientich(12,4);
        System.out.println("chieu rong "+ "\t" + 4 + "\n" + "chieu dai "+ "\t" + 12 + "\n" +"cdien tich"+"\t" + dintich +"\n"+ str1);


    }
}