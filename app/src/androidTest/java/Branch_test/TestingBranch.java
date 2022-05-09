package Branch_test;

public class TestingBranch {
    String name;
    int id;
    float marks;
    String BloodGrp;

    public TestingBranch(String name, int id, float marks, String bloodGrp) {
        this.name = name;
        this.id = id;
        this.marks = marks;
        BloodGrp = bloodGrp;
    }

    public String getBloodGrp() {
        return BloodGrp;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void setBloodGrp(String bloodGrp) {
        BloodGrp = bloodGrp;
    }
}
