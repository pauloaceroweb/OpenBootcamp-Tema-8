public class Main {

    public static void main(String[] args) {

        Persona profesor = new Persona();
        profesor.setEdad(40);
        profesor.setNombre("Victor");
        profesor.setTelefono("954251269");

        System.out.println("*****************************************");
        System.out.println("DATOS DEL PROFESOR");
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Edad: " + profesor.getEdad() + " años");
        System.out.println("Teléfono: " + profesor.getTelefono());

        Persona alumno = new Persona();
        alumno.setEdad(45);
        alumno.setNombre("Paulo");
        alumno.setTelefono("3108519401");

        System.out.println("*****************************************");
        System.out.println("DATOS DEL ALUMNO");
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Edad: " + alumno.getEdad() + " años");
        System.out.println("Teléfono: " + alumno.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}