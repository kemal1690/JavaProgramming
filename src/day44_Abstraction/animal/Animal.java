package day44_Abstraction.animal;

/*
class Test{
    public static void main(String[] args) {
        System.out.println(new Test().getClass().getSimpleName());
        System.out.println(new Test().getClass().getName());
    }
}

 */


public abstract class Animal {

private String name;
private final String breed;//when we create an object we dont wanna change the breed thats why we make it final
private final char gender;//when we set the gender we dont wanna change it thats why we make it final
private int age;
private char size;
private final String color;

    public final static boolean canBreathe;//we can change the static but we cannot change the final variable

    static{
        canBreathe = true;
    }

    public Animal(String name, String breed, char gender, int age, char size, String color) {
       setName(name);//We are calling setter
       this.breed = breed;
       if( !(gender=='M' ||gender == 'F') ){
           throw new RuntimeException("Invalid gender " + gender);
       }
       this.gender = gender;
       setAge(age);
       setSize(size);
       this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name.isEmpty()){
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public abstract void eat();

    public final void drink(){//We cant make this static because if we make this static we cannot use different animal names

        System.out.println(name + " is drinking water");//if we make the method static name gives compile error.

                                                        //Because name is an instance variable


    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)
			Encapsulate all the fields
			Add a constructor that can set all the fields
			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal
 */