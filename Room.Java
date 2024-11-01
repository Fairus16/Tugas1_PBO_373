public abstract class Room {
    protected String roomType;      //Bagian dari encapulation
    protected double baseRate;      //Bagian dari encapulation
    protected boolean isAvailable;  //Bagian dari encapulation

    public Room(String roomType, double baseRate) { //Contructor Overloading
        this.roomType = roomType;
        this.baseRate = baseRate;
        this.isAvailable = true;
    }

    public double getBaseRate() { //Getter
        return baseRate;
    }

    public abstract double calculateRate(); //Polymorphism dan Overriding

    public String getRoomType() { //Getter
        return roomType;
    }

    public boolean isAvailable() { //Getter
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable) { //Setter
        this.isAvailable = isAvailable;
    }
}
