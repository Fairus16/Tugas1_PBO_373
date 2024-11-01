public class StandardRoom extends Room { //Inheritence dari kelas Room
    public StandardRoom() { //Constructor Overloading
        super("Standard", 1000000);  //Memanggil konstruktor kelas induk Room
    }

    @Override
    public double calculateRate() { //overriding method dari kela Room
        return baseRate;
    }
}
