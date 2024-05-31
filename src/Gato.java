// Con esto especificamos que gato hereda de animal
public class Gato extends Animal{

    public Gato(String nombre, int edad) {
        // Con la palabra super estamos asignando la informacion heredada
        super(nombre, edad);
    }

    // Override = signica sobre escribir
    //Esto es polimorfismo
    //El polimorfimos en metodos permite que metodos con el mismo nombre pero en diferente 
    //clase se comporten de manera distinta segun el el tipo de objeto al que se llama
    @Override
    public String hacerSonido() {
        return "Miau";
    }

}
