import java.util.ArrayList;

public class Student {

    private long getId;
    private String getName;
    private ArrayList<Integer> grades;

    public Student(long getId, String getName, ArrayList<Integer> grades) {
        this.getId = getId;
        this.getName = getName;
        this.grades = new ArrayList<>();
    }

    public long getGetId() {
        return getId;
    }

    public String getGetName() {
        return getName;
    }

    public void getAddGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrade() {
        return grades;
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

}
