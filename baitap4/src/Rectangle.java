public class Rectangle extends Shape {

    @Override
    public double getArea() {
        return 100;
    }


    @Override
    public String getdisplay() {
        return "mau hong";
    }

    public int dientich(int witch,int heigth) {
        int dientich = witch * heigth;
        return dientich;
    }



}
