package impuestovehicular;

public class Automovil {

    private String marca;
    private String linea;
    private int precio;
    private int anio;

    public Automovil() {
        this.marca = "Renault";
        this.linea = "carro";
        this.anio = 2000;
        this.precio = 50000000;
    }

    public Automovil(String marca, String linea, int anio, int precio) {
        this.marca = marca;
        this.linea = linea;
        this.anio = anio;
        this.precio = precio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getLinea() {
        return this.linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

}
