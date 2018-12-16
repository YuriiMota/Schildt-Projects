/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

/**
 *
 * @author Yura
 */
class Twod{
    int x,y;
    Twod(int a, int b){
       x=a;
       y=b;
    }
}
class ThreeD extends Twod{
    int z;
    ThreeD(int a, int b, int c){
        super(a,b);
        z=c;
    }
}
class FourD extends ThreeD{
    int t;
    FourD(int a, int b, int c, int d){
      super(a,b,c);
      t=d;
    }
}
class Coords<T extends Twod>{
    T[] coords;
    Coords(T[] o){
        coords=o;
    }
}
public class BoundedWildcard {
    static void showXY(Coords<?> c){
        System.out.println("Координати X Y: ");
        for (int i=0;i<c.coords.length;i++)
            System.out.println(c.coords[i].x+ " "+c.coords[i].y+ " " );
            System.out.println();
    }
    static void showXYZ(Coords<? extends ThreeD> c){
        System.out.println("Координати X Y Z: ");
        for (int i=0;i<c.coords.length;i++)
            System.out.println(c.coords[i].x+ " "+c.coords[i].y+ " "+c.coords[i].z );
            System.out.println();
    }
     
    static void showAll(Coords<? extends FourD> c){
        System.out.println("Координати X Y Z T: ");
        for (int i=0;i<c.coords.length;i++)
            System.out.println(c.coords[i].x+ " "+c.coords[i].y+ " "+c.coords[i].z +" "+c.coords[i].t);
            System.out.println();
    }
    public static void main(String args[]){
        Twod td[]= {
            new Twod(0,0),
            new Twod(7,9),
            new Twod(18,4),
            new Twod(-1,-23)
    };
    Coords<Twod> tdlocs = new Coords<Twod>(td);
    System.out.println("Вміст обєкту tdlocs");
    showXY(tdlocs);
        FourD fd[]={
            new FourD(4,7,8,9),
            new FourD(7,3,6,8),
            new FourD(22,-34,-2,3),
            new FourD(3,45,2,6)
        };
    
    
    Coords<FourD>fdlocs = new Coords<FourD>(fd);
            System.out.println("Вміст обєкту tdlocs");
    showXY(fdlocs);
    showXYZ(fdlocs);
    showAll(fdlocs);
    
    }
}
