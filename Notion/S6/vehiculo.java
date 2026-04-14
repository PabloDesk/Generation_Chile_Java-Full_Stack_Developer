public class Vehiculo {
    // Atributos encapsulados
    private String patente;
    private String marca;
    private String modelo;
    private double capacidadCarga;
    private boolean disponible;

    // Constructor
    public Vehiculo(String patente, String marca, String modelo, double capacidadCarga) {
        // Usamos los setters para aprovechar las validaciones desde el inicio
        setPatente(patente);
        setMarca(marca);
        this.modelo = modelo;
        setCapacidadCarga(capacidadCarga);
        this.disponible = true; // Por defecto, todo vehículo inicia disponible
    }

    // --- Getters y Setters con Validaciones ---

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede estar vacía.");
        }
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        if (capacidadCarga < 0) {
            throw new IllegalArgumentException("La capacidad de carga no puede ser negativa.");
        }
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * Método que será sobrescrito por las clases hijas (Polimorfismo).
     */
    public void mostrarDetalle() {
        System.out.print("Vehículo -> Patente: " + patente + 
                         " | Marca: " + marca + 
                         " | Modelo: " + modelo + 
                         " | Capacidad: " + capacidadCarga + "kg" +
                         " | Estado: " + (disponible ? "Disponible" : "No disponible"));
    }
}
