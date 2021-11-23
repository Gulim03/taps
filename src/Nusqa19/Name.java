package Nusqa19;

public class Name {
    public static Photo[] createArray(Photo[] p) {
        p[0]=new Photo("Home",7);
        p[1]=new Photo("Africa",7);
        p[2]=new Photo("Year",5);
        p[3]=new Photo("People",45);
        p[4]=new Photo("University",5);
        return p;
    }
    public void print(Photo[] p ) {
        for (int i = 0; i < p.length; i++)
            System.out.println(p[i].toString());
    }
}
