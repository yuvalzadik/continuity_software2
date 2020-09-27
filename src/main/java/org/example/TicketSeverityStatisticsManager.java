package org.example;

import java.util.*;

public class TicketSeverityStatisticsManager implements ITicketSeverityStatisticsManager {

    private  ITicketManager manager ;
    private Collection<ITicket> tickets;
    private  LinkedList<ITicketSeverity> severity_tickets;
    String ticketCVE;

    @Override
    public void calcCVEStatistics() {

        ArrayList<String> list = new ArrayList<String>();

        tickets = this.manager.getTickets();
        for (ITicket ticket : tickets) {
            if (ticket instanceof ITicketCVE) {
                String ticketCVE = ((ITicketCVE) ticket).getCVE();
                list.add(ticketCVE);
            }
        }
             // hash set is created and elements of
            // arraylist are insertd into it
            Set<String> st = new HashSet<String>(list);
            for (String s : st)
                System.out.println(s + ": " + Collections.frequency(list, s));

    }


    @Override
    public void calcStatistics() {
        ArrayList<ITicketSeverity.Severity> list = new ArrayList<ITicketSeverity.Severity>();
        tickets = this.manager.getTickets();
        for (ITicket ticket : tickets) {
            if (ticket instanceof ITicketSeverity) {
                ITicketSeverity.Severity ticketSeverity = ((ITicketSeverity) ticket).getSeverity();
                list.add(ticketSeverity);
            }
        }
        Set<ITicketSeverity.Severity> st = new HashSet<ITicketSeverity.Severity>(list);
        for (ITicketSeverity.Severity s : st)
            System.out.println(s + ": " + Collections.frequency(list, s));
    }





    public TicketSeverityStatisticsManager(ITicketManager manager) {
      this.manager = manager ;

}
}

