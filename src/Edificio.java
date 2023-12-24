import java.util.ArrayList;

// Interfaz ImpactoEcologico
interface ImpactoEcologico {
    double obtenerImpactoEcologico();
}

// Clase Edificio implementando la interfaz
class Edificio implements ImpactoEcologico {
    private String nombre;
    private double consumoEnergia;

    public Edificio(String nombre, double consumoEnergia) {
        this.nombre = nombre;
        this.consumoEnergia = consumoEnergia;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Lógica para calcular el impacto ecológico de un edificio (por ejemplo, emisiones de CO2)
        return consumoEnergia * 0.05; // Ejemplo simple, ajusta según sea necesario
    }

    public void mostrarInformacion() {
        System.out.println("Edificio: " + nombre);
    }
}

// Clase Auto implementando la interfaz
class Auto implements ImpactoEcologico {
    private String modelo;
    private double emisionesCO2;

    public Auto(String modelo, double emisionesCO2) {
        this.modelo = modelo;
        this.emisionesCO2 = emisionesCO2;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Lógica para calcular el impacto ecológico de un auto
        return emisionesCO2;
    }

    public void mostrarInformacion() {
        System.out.println("Auto: " + modelo);
    }
}

// Clase Bicicleta implementando la interfaz
class Bicicleta implements ImpactoEcologico {
    private String tipo;
    
    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Lógica para calcular el impacto ecológico de una bicicleta (puede ser muy bajo)
        return 0;
    }

    public void mostrarInformacion() {
        System.out.println("Bicicleta: " + tipo);
    }
}

// Clase principal que crea objetos y utiliza polimorfismo
public class Main {
    public static void main(String[] args) {
        // Crear objetos de cada clase
        Edificio edificio = new Edificio("Edificio A", 1000);
        Auto auto = new Auto("Sedan", 5.2);
        Bicicleta bicicleta = new Bicicleta("De montaña");

        // Crear ArrayList de tipo ImpactoEcologico y agregar objetos
        ArrayList<ImpactoEcologico> listaObjetos = new ArrayList<>();
        listaObjetos.add(edificio);
        listaObjetos.add(auto);
        listaObjetos.add(bicicleta);

        // Iterar a través del ArrayList e invocar obtenerImpactoEcologico
        for (ImpactoEcologico objeto : listaObjetos) {
            objeto.mostrarInformacion();
            System.out.println("Impacto Ecológico: " + objeto.obtenerImpactoEcologico());
            System.out.println();
        }
    }
}
