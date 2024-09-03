package java_course_03_01;
public class Person {
    // 私有屬性，只能在類內被訪問
    private double height;
    private double weight;

    // 構造方法，初始化身高體重
    public Person(double height, double weight) {
        setHeight(height);
        setWeight(weight);
    }

    // 設定身高，並檢查是否在合理範圍內
    public void setHeight(double height) {
        if (height >= 0 && height <= 2.5) { // 假設合理身高範圍為0-2.5米
            this.height = height;
        } else {
            System.out.println("身高值不合理，請重新輸入！");
        }
    }

    // 設定體重，並檢查是否在合理範圍內
    public void setWeight(double weight) {
        if (weight >= 0 && weight <= 200) { // 假設合理體重範圍為0-200公斤
            this.weight = weight;
        } else {
            System.out.println("體重值不合理，請重新輸入！");
        }
    }

    // 取得身高
    public double getHeight() {
        return height;
    }

    // 取得體重
    public double getWeight() {
        return weight;
    }

    // 計算BMI
    public double calculateBMI() {
        return weight / (height * height);
    }
}