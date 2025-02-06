public class TableOfStudentGrades {
    public static void main(String[] args) {

        student student1 = new student("Billy", 32, 8);
        student student2 = new student("Joe", 43, 7);
        student student3 = new student("Tom", 45, 6);
        student student4 = new student("Willy", 50, 8);
        student student5 = new student("John", 90, 1);
        student student6 = new student("Richard", 69, 1);

        student[] students = {student1, student2, student3, student4, student5, student6};

        printTable(students);
    }

    public static void printTable(student[] contents) {
        System.out.print("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n==\t\t\tStudent Points\t\t\t==\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////\n\n");
        System.out.print("Name\t\tLab\t\tBonus\tTotal\n----\t\t---\t\t-----\t-----\n");
        for (student content : contents) {
            if (content.name.length() < 4) {
                content.name = (content.name + "\t");
            }
            System.out.println(content.name + "\t\t" + content.getLabGrade() + "\t\t" + content.getBonus() + "\t\t" + content.getTotal() );
        }
    }

}
class student {
    String name;
    private final int labGrade;
    private final int bonus;

    public student(String name, int labGrade, int bonus) {
        this.name = name;
        this.labGrade = labGrade;
        this.bonus = bonus;
    }
    public int getTotal() {
        return labGrade + bonus;
    }
    public int getLabGrade() { return labGrade; }
    public int getBonus() { return bonus; }
}