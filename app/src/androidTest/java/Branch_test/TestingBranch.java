package Branch_test;

public class TestingBranch {
    String name;
    int id;
    float marks;

    TestingBranch( String n , int i , float m )
    {
        this.name = n;
        this.id = i;
        this.marks = m;
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
}
