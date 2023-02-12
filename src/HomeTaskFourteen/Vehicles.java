package HomeTaskFourteen;

public enum Vehicles {
    MAZDA (35000){
        public String getCollar() {
            return "Red";
        }
    },
    OPEL (27000) {
        public String getCollar() {
            return "Black";
        }
    },
    PEUGEOT(21000){
        public String getCollar() {
            return "White";
        }
    };
    int price;

    Vehicles(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicles " + super.toString() +
                ", price = " + price + ", Collar = " + getCollar();
    }
    public abstract String getCollar();
}
