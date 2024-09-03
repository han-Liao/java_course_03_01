package java_course_03_01;
public abstract class Shape {
    protected String color;

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea(); // 抽象方法，計算面積

    public void display() {
        System.out.println("形狀顏色: " + color);
        System.out.println("面積: " + getArea());
    }
}