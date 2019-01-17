public class Volume2 extends Volume1{
    private int pints;
    Volume2(){
        super(0,0);
        pints = 0;
    }
    Volume2(int t,int p, int oz){
        super(t,p);
        pints = oz;
    }
    Volume2(Volume2 w){
        super(w.getBarrels(),w.getGallons());
        pints = w.getPints();
    }
    public void setPints(int oz){
        this.pints = oz;
    }
    public int getPints(){
        return this.pints;
    }
    public Volume2 add(Volume2 w){
        Volume2 x = new Volume2(0,0,this.toPints()+w.toPints());
        x.convert();
        return x;
    }
    public Volume2 subtract(Volume2 w){
        Volume2 x = new Volume2(0,0,this.toPints()-w.toPints());
        x.convert();
        return x;
    }
    public void convert(){
        while (this.pints>=8){
            this.pints = this.pints - 8;
            this.setGallons(this.getGallons()+1);
        }
        super.convert();

    }
    public int toPints(){
        return super.toPints()+this.pints;
    }
    public String toString(){
        return super.toString() + " Pints:" + this.pints;
    }
    public int compareTo(Volume2 w){
        return this.toPints() - w.toPints();
    }
}