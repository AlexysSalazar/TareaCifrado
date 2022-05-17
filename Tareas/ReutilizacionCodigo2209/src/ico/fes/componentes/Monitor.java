/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author win10-94
 */
public class Monitor {
    private String marca;
    private float pulgada;

    public Monitor() {
    }

    public Monitor(String marca, float pulgada) {
        this.marca = marca;
        this.pulgada = pulgada;
    }

    public float getPulgada() {
        return pulgada;
    }

    public void setPulgada(float pulgada) {
        this.pulgada = pulgada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", pulgada=" + pulgada + '}';
    }
    
}
