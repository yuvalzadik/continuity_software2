package org.example;
import java.io.*;
import javax.print.attribute.standard.Severity;
import java.util.LinkedList;
import java.util.Random;

public class App 
{


    public static void main(String[] args )
    {

        //create 1000 tickes automatically and assign them to the ticket manager
        ITicketManager ticket_Manager = new TicketManager(); // create on ticket manager
        String [] description = {"NetApp issue", "Vmware bug ", "Unix service failed","Http status 400"};
        String [] resolution = {"Rebooting system", "Update version ", "Replacing cable","Changing network configuration"};
        String [] cve = {"CVE-2020-012", "CVE-2020-013", "CVE-2020-014","CVE-2020-015","CVE-2020-016"};
        ITicketSeverity.Severity[] severities = { ITicketSeverity.Severity.ERROR, ITicketSeverity.Severity.WARNING, ITicketSeverity.Severity.INFORMATION};
        Random random = new Random();
        for(short i =0; i< 1000; i++ ){
            int select_description = random.nextInt(description.length);
            int select_resolution = random.nextInt(resolution.length);
            int select_CVE = random.nextInt(cve.length);
            int select_severity = random.nextInt(severities.length);

            if (i< 330) {
                ITicket sec_ticket = new SecurityTicket(i, description[select_description], resolution[select_resolution], cve[select_CVE], severities[select_severity]);
                ticket_Manager.addTicket(sec_ticket);
            }

            else if (i<660){
                ITicket  best_ticket = new  BestPracticeTicket(i, description[select_description], resolution[select_resolution], cve[select_CVE], severities[select_severity]);
                ticket_Manager.addTicket(best_ticket);
            }
            else {
                ITicket  con_ticket = new  ConfigurationTicket(i, description[select_description], resolution[select_resolution], severities[select_severity]);
                ticket_Manager.addTicket(con_ticket);
            }
        }
        TicketSeverityStatisticsManager  statisticsManager= new TicketSeverityStatisticsManager(ticket_Manager); // creating new statistics manager - and assign the current ticket_manger



        // Example of using the program
        System.out.println("\nCurrent List:\n" + ticket_Manager.getTickets());
        System.out.println("\ncount\n  " + ticket_Manager.getTickets().stream().count());

        //add a ticket
        int count = (int) ticket_Manager.getTickets().stream().count();
        ITicket new_ticket_test = new BestPracticeTicket(count, "description", "resolutio", "CVE-2020-023", ITicketSeverity.Severity.ERROR);
        ticket_Manager.addTicket(new_ticket_test);
        System.out.println("\nCurrent List after adding new ITicket:\n" + ticket_Manager.getTickets());
        System.out.println("\nCount after adding new ITicket:\n  " + ticket_Manager.getTickets().stream().count());

        //remove a ticket
        ticket_Manager.removeTicket(new_ticket_test);
        System.out.println("\nCurrent List after removing the new ITicket:\n" + ticket_Manager.getTickets());
        System.out.println("\nCount after removing the new ITicket:\n  " + ticket_Manager.getTickets().stream().count());

        //calculate statistics
        System.out.println("\nCVE Statistics:\n");
        statisticsManager.calcCVEStatistics();
        System.out.println("\nSeverity Statistics:\n" );
        statisticsManager.calcStatistics();

    }
}