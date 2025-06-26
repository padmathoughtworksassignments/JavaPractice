class Person
{
    int age;
    String name;
    String location;
    String dob;
    String profession;
    int luckyNum;

    public Person(int ageIn, String nameIn, String locationIn,
                  String dobIn, String professionIn, int luckyNumIn) {
        this.age = ageIn;
        this.name = nameIn;
        this.location = locationIn;
        this.dob = dobIn;
        this.profession = professionIn;
        this.luckyNum = luckyNumIn;
    }


    public String printInfo() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", dob='" + dob + '\'' +
                ", profession='" + profession + '\'' +
                ", luckyNum=" + luckyNum +
                '}';
    }
}

class GrandParent extends Person
{
    public GrandParent(int ageIn, String nameIn, String locationIn, String dobIn, String professionIn, int luckyNumIn) {
        super(ageIn, nameIn, locationIn, dobIn, professionIn, luckyNumIn);
    }
}

class Parent extends GrandParent
{
    public Parent(int ageIn, String nameIn, String locationIn, String dobIn, String professionIn, int luckyNumIn) {
        super(ageIn, nameIn, locationIn, dobIn, professionIn, luckyNumIn);
    }
}

class Child extends Parent
{
    public Child(int ageIn, String nameIn, String locationIn, String dobIn, String professionIn, int luckyNumIn) {
        super(ageIn, nameIn, locationIn, dobIn, professionIn, luckyNumIn);
    }
}

/*
public class InheritancePractice {

}

 */
