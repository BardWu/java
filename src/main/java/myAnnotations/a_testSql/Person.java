package myAnnotations.a_testSql;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-12-30 16:59
 **/
@Table("person")
public class Person {

    @Column("age")
    public int age;

    @Column("name")
    private String name;

    @Column("address")
    private String address;

    public Person(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
