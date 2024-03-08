package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Esta clase crea una lista de contactos y las almacena para su posterior acceso y uso.
 * @author mario
 */
public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto

    /**
     * Este método es un constructor de la clase agenda por defecto.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Método para añadir contactos nuevos a la agenda.
     * @param name
     * @param phone
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Método para eliminar contactos de la agenda.
     * @param name
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

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
        for (Contacto c : contacts) {
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
    public List<Contacto> getContacts() {
        return this.contacts;
    }

    /**
     * Método para establecer un contacto.
     * @param contacts
     */
    public void setContacts(List<Contacto> contacts) {
        this.contacts = contacts;
    }
}