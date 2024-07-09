public class RutaMasRapida implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {
        // Implementación para calcular la ruta más rápida
        return "Ruta más rápida entre " + puntoA + " y " + puntoB;
    }
}

public class RutaMasCorta implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {
        // Implementación para calcular la ruta más corta
        return "Ruta más corta entre " + puntoA + " y " + puntoB;
    }
}

public class RutaMasEconomica implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {
        // Implementación para calcular la ruta más económica
        return "Ruta más económica entre " + puntoA + " y " + puntoB;
    }
}