public class Horse extends Animal {
    public boolean racingHorse;
    public Horse(String name,boolean racingHorse) {
        super(name);
        this.racingHorse=racingHorse;
    }
    public void Neigh(){
        System.out.println("Horse "+ name+" does brrrrrr");
    }
    public String toString()
    {
        return " This horse's name is: "+ name + " and he is "+racingHorse+"ly a race horse";
    }
}
