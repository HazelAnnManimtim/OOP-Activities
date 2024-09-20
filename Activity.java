public class Activity{

    public static void main(String[] args){

    Dog puppy = new Dog();

    puppy.setName (name:"naly");

    System.out.println(puppy.showName());

    puppy.bark();

    puppy.listofpuppies = new String[] { "ange", "naly", "hazel", "nica"};

    int shownumber = puppy.show_numofpuppies();

    System.out.println("Number of puppies; + shownumber");

    puppy.showPuppies();
    }
}