package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Esta clase crea una lista de contactos y las almacena para su posterior acceso y uso.
 * @author mario
 */
public class agendaContactos {
    private List<Persona> contacts; // Lista de Contacto

    /**
     * Este método es un constructor de la clase agenda por defecto.
     */
    public agendaContactos() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Método para añadir contactos nuevos a la agenda.
     * @param name
     * @param phone
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Método para eliminar contactos de la agenda.
     * @param name
     */
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Método para modificar un contacto de la agenda.
     * @param name
     * @param oldPhone
     * @param newPhone
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Método para obtener un contacto de la agenda.
     * @return
     */
    public List<Persona> getContacts() {
        return this.contacts;
    }

    /**
     * Método para establecer un contacto.
     * @param contacts
     */
    public void setContacts(List<Persona> contacts) {
        this.contacts = contacts;
    }
}