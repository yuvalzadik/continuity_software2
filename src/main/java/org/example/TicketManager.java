package org.example;

import java.util.Collection;
import java.util.LinkedList;

public class TicketManager implements ITicketManager {
    private  LinkedList<ITicket> tickets;
   /* private   int id;
    private  String description;
    private  String resolution;*/

/*    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getResolution() {
        return resolution;
    }*/



    @Override
    public void addTicket(ITicket ticket) {
        this.tickets.add(ticket);
    }

    @Override
    public void removeTicket(ITicket ticket) {
        this.tickets.remove(ticket);

    }

    @Override
    public ITicket getTicket(int id) {
        for (ITicket ticket : tickets){
            if (ticket.getId() == id)
                return ticket;
        }
        return null;

    }

    @Override
    public Collection<ITicket> getTickets() {
        return this.tickets ;
    }

    public TicketManager(LinkedList<ITicket> tickets) {
        this.tickets = new LinkedList<ITicket>();

    }
}


