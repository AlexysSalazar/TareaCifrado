/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealibro;

/**
 *
 * @author win10-94
 */
public class Libro {
    private String titulo;
    private String autor;
    private String color;
    private int paginas;
    private int ano;

    public Libro() {
    }

    public Libro(String titulo, String autor, String color, int paginas, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.color = color;
        this.paginas = paginas;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    //metodos
    public void pag(int pagina){
    System.out.println("Van en la pagina: "+ pagina + "del libro "+this.titulo);
}
    public void Nuevo(){
    System.out.println("El libro "+this.titulo+ " Es nuevo");
}

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
    
}



