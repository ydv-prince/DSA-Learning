public class OOPS{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Green");
        System.out.println(p1.getColor());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Prince";
        //myAcc.password = "ivub789";   private access modifier can't be assign
        myAcc.setPassword("3456viubsd");
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen{
    private String color;
    private int tip;

    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
    int getTip(){
        return this.tip;
    }
}

// class Student{
//     String name;
//     int age;
//     float percentage;

//     void calcPercentage(int phy, int chem, int math){
//         percentage = (phy+chem+math) / 3;
//     }
// }

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //Shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //Deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}