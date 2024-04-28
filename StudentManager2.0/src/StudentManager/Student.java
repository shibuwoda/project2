package StudentManager;

public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private int score;

    public Student() {

    }

    public Student(String id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        int result = this.score - o.score;
        result = result == 0?this.id.compareTo(o.id):result;
        return result;
    }
}
