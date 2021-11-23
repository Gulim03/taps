package Nusqa19;

import java.util.Objects;

public class Photo extends Album{
    int kol;

    public int getKol() {
        return kol;
    }

    public void setKol(int kol) {
        this.kol = kol;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(kol);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Photo other = (Photo) obj;
        return kol == other.kol;
    }

    @Override
    public String toString() {
        return "Photo "+ "[ nazvanye fotografi = " + name + " , kolichestvo fotografia = " + kol+"]" ;
    }

    public Photo(String name, int kol) {
        super(name);
        this.kol = kol;
    }


}
