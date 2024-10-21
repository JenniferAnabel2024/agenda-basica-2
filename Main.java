
    public class Main {
    public static void main(String[] args) {
        Agenda miAgenda = new Agenda();
        ContactoInfo contacto1 = new ContactoInfo("Jen", "123456789", "jen@example.com");
        ContactoInfo contacto2 = new ContactoInfo("Atlas", "987654321", "atlas@example.com");
        miAgenda.agregarContacto(contacto1);
        miAgenda.agregarContacto(contacto2);
        System.out.println("Contactos en la agenda:");
        miAgenda.listarContactos();



    }
}
