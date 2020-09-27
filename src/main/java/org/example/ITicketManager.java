package org.example;

import org.example.ITicket_Global;

import java.util.Collection;

public interface ITicketManager {
    void addTicket(ITicket ticket);
    void removeTicket(ITicket ticket);
    ITicket getTicket(int id);
    Collection<ITicket> getTickets();
}
