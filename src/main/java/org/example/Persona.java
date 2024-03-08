package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase permite crear contactos y almacenar sus datos. Estos contactos podrán almacenarse en una lista o agenda.
 * @author mario
 */
class Persona {
    private String name;
    private List<String> phones;

    /**
     * Método constructor por parámetros.
     * @param name
     * @param phone
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     *Método para obtener el nombre almacenado en un contacto.
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Método para obtener una lista con los numeros de teléfono de un contacto.
     * @return
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}