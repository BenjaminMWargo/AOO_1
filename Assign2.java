import java.util.Arrays;
public class Assign2{
    public static void main(String args[]){
        Volume1 a,b,c,d,e,f,g,h;
        Volume2 w,x,y,z;
        a = new Volume1(67, 37);
        b = new Volume1(56, 41);
        w = new Volume2(57, 38, 6);
        x = new Volume2(56, 41, 7);
        c = new Volume1();
        d = new Volume1();
        y = new Volume2();
        z = new Volume2();
        e = new Volume2();
        f = new Volume2();
        g = new Volume2();
        h = new Volume2();

        c = a.add(b);
        d = a.subtract(c);
        y = w.add(x);
        z = w.subtract(x);
        e = a.add(w);
        f = a.subtract(w);
        g = x.add(b);
        h = x.subtract(b);

        Volume[] arr= new Volume[]{a,b,c,d,e,f,g,h,w,x,y,z};
        for (Volume v:arr){
            System.out.print(v.toString()+"\n");
        }
        System.out.print("\n");
        Arrays.sort(arr);

        for (Volume v:arr){
            System.out.print(v.toString()+"\n");
        }
        System.out.print("\n");
        System.out.print(b.compareTo(x)+"\n");
        System.out.print(x.compareTo(b)+"\n");
        System.out.print("\n");
        System.out.print(a.toPints()+"\n");
        System.out.print(w.toPints()+"\n");
    }
}