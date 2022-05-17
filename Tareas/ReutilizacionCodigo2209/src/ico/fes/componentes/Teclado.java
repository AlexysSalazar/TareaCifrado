/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author win10-94
 */
public class Teclado {
    private String marca;
    private int numeroTelas;

    public Teclado() {
    }

    public Teclado(String marca, int numeroTelas) {
        this.marca = marca;
        this.numeroTelas = numeroTelas;
    }

    public int getNumeroTelas() {
        return numeroTelas;
    }

    public void setNumeroTelas(int numeroTelas) {
        this.numeroTelas = numeroTelas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", numeroTelas=" + numeroTelas + '}';
    }
    
}
