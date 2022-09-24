public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();
        persona.setEdad(28);
        persona.setNombre("Daniel Muñoz");
        persona.setTelefono("3156925929");

        System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años y su telefono es " + persona.getTelefono());
    }
}
