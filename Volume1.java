public class Volume1 extends Volume implements Comparable<Volume1>{
    private int barrels;
    private int gallons;
    Volume1(){
        barrels = gallons = 0;
    }

    Volume1(int t, int p){
        barrels = t;
        gallons = p;
    }

    Volume1(Volume1 w){
        barrels = w.getBarrels();
        gallons = w.getGallons();
    }
    public void setGallons(int p){
        this.gallons = p;
    }
    public int getGallons(){
        return this.gallons;
    }
    public void setBarrels(int t){
        this.barrels = t;
    }
    public int getBarrels(){
        return this.barrels;
    }
    public Volume1 add(Volume1 w){
        Volume1 x = new Volume1(this.barrels+w.getBarrels(),this.gallons+w.getGallons());
        x.convert();
        return x;
    }
    public Volume1 subtract(Volume1 w){
        int gal,bar;
        gal = bar = 0;
        //Subtract the barrels then convert to gallons
        bar = 42*(this.barrels - w.getBarrels());
        //Subtract gallons then add in bar
        gal = this.gallons - w.getGallons()+bar;
        if (bar < 0) bar = 0;
        Volume1 x = new Volume1(0,gal);
        x.convert();
        return x;
    }
    public int toPints(){
        return this.getBarrels()*42*8 + this.getGallons()*8;
    }
    public void convert(){
        while (this.gallons >= 42){
            gallons = gallons - 42;
            barrels++;
        }
    }
    public String toString(){
        return "Barrels:" + this.barrels + " Gallons:" + this.gallons;
    }
    public int compareTo(Volume1 w){
        return this.toPints() - w.toPints();
    }
}