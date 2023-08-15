public class Worker {
    private String name;
    private int age;
    private String emale;

    public Worker(String name, int age, String emale) {
        this.name = name;
        this.age = age;
        this.emale = emale;
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

    public String getEmale() {
        return emale;
    }

    public void setEmale(String emale) {
        this.emale = emale;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", emale='" + emale + '\'' +
                '}';
    }
}
