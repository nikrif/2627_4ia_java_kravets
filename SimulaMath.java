public class SimulaMath {

    public SimulaMath() {
    }

    public double potenza(double base, double esponente) {
        return Math.pow(base, esponente);
    }

    public double radiceQuadrata(double x) {
        return Math.sqrt(x);
    }


    public double seno(double x) {
        return Math.sin(x);
    }

    public double coseno(double x) {
        return Math.cos(x);
    }

    public double tangente(double x) {
        return Math.tan(x);
    }

    public double logaritmo(double x) {
        return Math.log(x);
    }

    public double esponenziale(double x) {
        return Math.exp(x);
    }

    public double valoreAssoluto(double x) {
        return Math.abs(x);
    }

    public double arrotondaPerDifetto(double x) {
        return Math.floor(x);
    }

    public long arrotonda(double x) {
        return Math.round(x);
    }
}
