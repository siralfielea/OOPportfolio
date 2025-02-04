public class TableOfStudentGrades {
    public static void main(String[] args) {
        System.out.print("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n==\t\t\tStudent Points\t\t\t==\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////\n\n");
        System.out.print("Name\t\tLab\tBonus\tTotal\n----\t\t---\t-----\t-----");

        student student1 = new student("Billy", 32, 8);
        student student2 = new student("Joe", 43, 7);
        student student3 = new student("Tom", 45, 6);
        student student4 = new student("Willy", 50, 8);
        student student5 = new student("John", 90, 1);
        student student6 = new student("Richard", 69, 1);

        System.out.println(student1.name);
    }

}
class student {
    String name;
    private final int labGrade;
    private final int bonus;

    public student(String name, int labGrade, int bonus) {
        this.labGrade = labGrade;
        this.bonus = bonus;
    }
    public int getTotal() {
        return labGrade + bonus;
    }
}