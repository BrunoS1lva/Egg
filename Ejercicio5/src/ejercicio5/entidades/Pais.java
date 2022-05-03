package ejercicio5.entidades;

import java.util.Objects;

public class Pais implements Comparable<Pais> {

    private String nombresPaises;

    public Pais() {
    }

    public Pais(String nombresPaises) {
        this.nombresPaises = nombresPaises;
    }

    public String getNombresPaises() {
        return nombresPaises;
    }

    public void setNombresPaises(String nombresPaises) {
        this.nombresPaises = nombresPaises;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.nombresPaises);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombresPaises, other.nombresPaises))
        {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Pais t) {
        return this.nombresPaises.compareTo(t.getNombresPaises());
    }
    
    

}
