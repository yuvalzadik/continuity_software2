package org.example;

import org.example.ITicket;
import org.example.ITicketManager;

import java.util.Collection;
import java.util.LinkedList;

public class TicketManager implements ITicketManager {
      private  LinkedList<ITicket> tickets;
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

    public TicketManager() {
        tickets = new LinkedList<ITicket>();

    }
}


