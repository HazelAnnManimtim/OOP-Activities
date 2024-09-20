public class Dog {
    
    String Name;
    boolean isMale;
    int num_ofpuppies;
    String listofpuppies[] = new String [4];

    public void setName(String name){
        Name = name;
    }

    public String showName {
        return Name;
    }

    public void bark() {
        System.out.println(x:"Woof ! Woof !");
    }

    public int show_numofpuppies(int numberOfPuppies) {
        int count = 0;

        for(int i=0; i <listofpuppies.length; i++){
            count++
        }
        return count;
    }

    public void showpuppies(){
        for (int i = 0; i < listofpuppies.length; i++)
             system.out.println(listofpuppies[i]);
    }
}

    