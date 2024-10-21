
    import java.util.ArrayList;
    public class Agenda {
    private ArrayList<ContactoInfo> contactos;
    public Agenda() {
        contactos = new ArrayList<>();
    }
    public void agregarContacto(ContactoInfo contacto) {
        contactos.add(contacto);
    }
    public void eliminarContacto(String nombre) {
        contactos.removeIf(contacto -> contacto.getNombre().equals(nombre));
    }
    public void listarContactos() {
        for (ContactoInfo contacto : contactos) {
          
       System.out.println("Nombre: " + contacto.getNombre() + ", Teléfono: " + contacto.getTelefono() + ", Email: " + contacto.getEmail());
       System.out.println("Teléfono: " + contacto.getTelefono());
       System.out.println("Email: " + contacto.getEmail());
       System.out.println("----------------------");
        }
        
    }
}

 


   
