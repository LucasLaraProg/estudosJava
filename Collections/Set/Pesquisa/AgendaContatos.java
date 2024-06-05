package edu.Collections.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contatos> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }
    public void addContact(String name,int number){
        contatosSet.add(new Contatos(name,number));
    }
    public void showContacts(){
        System.out.println(contatosSet);
    }
    public Set<Contatos> findForName(String name){
        Set<Contatos> contactsForName= new HashSet<>();
    for (Contatos c: contatosSet){
        if (c.getNome().startsWith(name)){
            contactsForName.add(c);
        }
    }
    return contactsForName;
    }
    public Contatos updateContact(String name,int newNumber){
        Contatos contactUpdated =null;
        for (Contatos c:contatosSet){
            if (c.getNome().equalsIgnoreCase(name)){
                c.setNumero(newNumber);
                contactUpdated=c;
                break;
            }
        }
        return  contactUpdated;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos =new AgendaContatos();
        agendaContatos.addContact("Lucas",123123);
        agendaContatos.addContact("Lucas Emanuel",123123);
        agendaContatos.addContact("Lucas",123);
        agendaContatos.addContact("Joao",123123);
        agendaContatos.addContact("Marcos",123123);
        agendaContatos.showContacts();
        System.out.println(agendaContatos.findForName("Lucas"));
        System.out.println("Contato atualizado: "+agendaContatos.updateContact("Lucas Emanuel",15555));
        agendaContatos.showContacts();
    }
}
