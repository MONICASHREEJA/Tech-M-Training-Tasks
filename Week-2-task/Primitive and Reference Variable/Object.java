public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return age == user.age && name.equals(user.name);
    }
}

class secondUser {
    private String name;
    private int age;

    public secondUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Object {
    public static void main(String[] args) {
        User user1 = new User("Joe", 25);
        User user2 = new User("Jill", 10);
        secondUser secondUser1 = new secondUser("Joe", 25);
        secondUser secondUser2 = new secondUser("Jill", 10);

        System.out.println("User class with overridden methods:");
        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);
        System.out.println("user1.equals(user2): " + user1.equals(user2));

        System.out.println("\nSecondUser class without overridden methods:");
        System.out.println("secondUser1: " + secondUser1);
        System.out.println("secondUser2: " + secondUser2);
        System.out.println("secondUser1.equals(secondUser2): " + secondUser1.equals(secondUser2));
    }
}
