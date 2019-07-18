import java.util.Comparator;

public class Hero implements Comparable<Hero> {

    @Override
    public int compareTo(Hero hero) {
        return this.getName().compareTo(hero.getName());
    }

    static Comparator<Hero> heroAgeComparator = new Comparator<Hero>() {
        @Override
        public int compare(Hero hero1, Hero hero2) {
            return hero2.getAge() - hero1.getAge();
        }
    };

    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}