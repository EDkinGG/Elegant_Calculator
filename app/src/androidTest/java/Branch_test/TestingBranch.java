package Branch_test;

public class TestingBranch {
    String name;
    int id;
    float marks;
    int streetNo;

    public TestingBranch(String name, int id, float marks, int streetNo) {
        this.name = name;
        this.id = id;
        this.marks = marks;
        this.streetNo = streetNo;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public int getId() {
        return id;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
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
}
