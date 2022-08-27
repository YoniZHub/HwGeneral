public class Dog {
    String name;
    int age;
    String breed;

    public Dog(String name , int age , String breed){
        this.name=name;
        this.age=age;
        this.breed=breed;
    }
public String toString()
{
    String result= "Name of Dog is: "+ name+"\n age of dog is: "+age + "\n breed of dog is:"+breed;
    return result;
}
    public void bark(){
        System.out.println("woof, woof! "+name);
    }
}
