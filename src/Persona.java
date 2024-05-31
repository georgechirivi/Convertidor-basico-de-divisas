public class Persona {

    // Atributos (estado/caracteristicas de un objeto)
    private String nombre;
    private String apellido;
    private int edad;
    

    // Constructor
    public Persona(String nombre, String apellido, int edad) {

        // This: Se utiliza para acceder a variable de instancia o metodo de la clase
        // actual y puede ser util
        // para evitar ambiguedades en casos donde hay
        // nombres de variables locales que coinciden con nombres de variables de
        // instancia

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    // Metodo (comportamiento de un objeto)
    public String darNombreCompleto() {
        return apellido + ", " + nombre;
    }

    public String enviarSaludo(String saludo) {
        if (edad > 40)
            return "Buenos dias, querido " + saludo;
        return "Hola, ¿como estas " + saludo + "?";
    }

    
    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
