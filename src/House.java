public class House {
    public final String adress;
    public final float squreArea;
    public String owner;


    public House(String adress, float squreArea)
    {
        this(adress,squreArea,"");
    }
    public House(String adress, float squreArea , String owner) {
        this.adress = adress;
        this.squreArea = squreArea;
        this.owner = owner;
    }

}
