package Lesson25.UzumBank.Entery.User;

public class User {
    private String name;
    private String lastname;
    private String id;
    private Enum kard;

    public User() {
    }

    public User(String name, String lastname, String id) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getId() {
        return id;
    }

    public Enum getKard() {
        return kard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setKard(Enum kard) {
        this.kard = kard;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id='" + id + '\'' +
                ", kard=" + kard +
                '}';
    }
}
