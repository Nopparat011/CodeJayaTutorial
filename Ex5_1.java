public class Ex5_1 {
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        // ตัวอย่างการใช้งานเมธอด calculateTriangleArea
        double base = 10.0; // ความยาวฐาน
        double height = 5.0; // ส่วนสูง

        double area = calculateTriangleArea(base, height);
        System.out.println("พื้นที่ของสามเหลี่ยมคือ: " + area);
    }
}

