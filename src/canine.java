public class canine extends Animal {

    public  String favortieDogFood;
    public canine(String name) {
        super(name);
         this.favortieDogFood=favortieDogFood;
    }
    public String bark() {
        return "Dog "+ name+" bark woof!";
    }
    public String toString()
    {
        return " This dog name is: "+ name + " and his favorite food is "+ favortieDogFood + "and he " + bark();
    }
}
