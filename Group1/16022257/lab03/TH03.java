package th03;
//b3

class Dog {

    String name;
    String type;
    String sex;
    String color;

    // khoi tao
    public Dog(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }
    //geter/seter

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}

class House {

    String add;
    Float size;
    String color;
    //phuong thuc khoi tao

    public House(String add, Float size, String color) {
        this.add = add;
        this.size = size;
        this.color = color;
    }
    //phuong thuc get/set

    public void setAdd(String add) {
        this.add = add;
    }

    public String getAdd() {
        return add;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public Float getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}

class Street {

    String name;
    String length;
    //phương thuc khoi tao

    public Street(String name, String length) {
        this.name = name;
        this.length = length;

    }
    //phuong thuc geter/seter 

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getLength() {
        return length;
    }

}

class Teacher {

    String name;
    int age;
    String sub;

    // phuongthuc khoi tao cho giao vien
    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.sub = subject;
    }

    // phương thuc geter/seter 
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSubject(String subject) {
        this.sub = subject;
    }

    public String getSub() {
        return sub;
    }

}

public class TH03 {

    public static void main(String[] args) {
        System.out.println(UCLN(2, 5));
        System.out.println(Fibonaxi(8));

        PhanSo ps1 = new PhanSo(7, 3);
        PhanSo ps2 = new PhanSo(5, 8);
        // phuong thuc cong tru nhan chia
        ps1.congPhanSo(ps2);
        ps1.truPhanSo(ps2);
        ps1.nhanPhanSo(ps2);
        ps1.chiaPhanSo(ps2);

    }

    //tim UClN
    public static int UCLN(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return UCLN(b, a % b);
        }
    }
    //Day Fibonaxi

    public static int Fibonaxi(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (n > 2) {
            return Fibonaxi(n - 1) + Fibonaxi(n - 2);
        } else {
            return 0;
        }
    }
}
