package Rashed;

public class Rashed {
    int id;
    String name;
    Rashed( String s , int i )
    {
        this.id =  i;
        this.name = s;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
