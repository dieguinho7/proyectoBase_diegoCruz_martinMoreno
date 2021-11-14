package Objetos;

import java.util.Arrays;
import java.util.Objects;

public class Insumos {

    private int id;
    private String[] insumos = {"Chevrolet SPARK GT", "Hyundai GRAND i10", "Chevrolet Groovy", "Audi TT", "Mitsubishi Lacer", "Chevrolet Corsa"};
    private int[] precio = {6000000, 5400000, 12000000, 24000000, 8400000, 2400000};
    private int stock;

    public Insumos()
    {

    }

    public Insumos(int id, String[] insumos, int[] precio, int stock) {
        this.id = id;
        this.insumos = insumos;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getInsumos() {
        return insumos;
    }

    public void setInsumos(String[] insumos) {
        this.insumos = insumos;
    }

    public int[] getPrecio() {
        return precio;
    }

    public void setPrecio(int[] precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Insumos insumos1 = (Insumos) o;
        return id == insumos1.id && stock == insumos1.stock && Arrays.equals(insumos, insumos1.insumos) && Arrays.equals(precio, insumos1.precio);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, stock);
        result = 31 * result + Arrays.hashCode(insumos);
        result = 31 * result + Arrays.hashCode(precio);
        return result;
    }

    @Override
    public String toString() {
        return "Insumos{" +
                "id=" + id +
                ", insumos=" + Arrays.toString(insumos) +
                ", precio=" + Arrays.toString(precio) +
                ", stock=" + stock +
                '}';
    }

    //REGLA DE NEGOCIO
    public int anadirAdicional(int precio, int adicional)
    {
        return precio + adicional;
    }
}
