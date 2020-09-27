package org.example;
import java.io.*;
import javax.print.attribute.standard.Severity;
import java.util.Random;

/*import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.sun.net.httpserver.HttpPrincipal;
import com.sun.net.httpserver.HttpsParameters;


import javax.swing.text.html.HTML;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;*/

public class App 
{


    public static void main(String[] args )
    {

        //create 1000 tickes automatically and assign them to the ticket manager
        String [] title = {"BestPracticeTicket", "SecurityTicket", "ConfigurationTicket"};
        String [] description = {"NetApp issue", "Vmware bug ", "Unix service failed","Http status 400"};
        String [] resolution = {"Rebooting system", "Update version ", "Replacing cable","Changing network configuration"};
        String [] cve = {"CVE-2020-012", "CVE-2020-013", "CVE-2020-014","CVE-2020-015","CVE-2020-016"};
        ITicketSeverity.Severity[] severities = { ITicketSeverity.Severity.ERROR, ITicketSeverity.Severity.WARNING, ITicketSeverity.Severity.INFORMATION};
        Random random = new Random();
        for(short i =1; i< 10; i++ ){
            int select_title = random.nextInt(title.length);
            int select_description = random.nextInt(description.length);
            int select_resolution = random.nextInt(resolution.length);
            int select_CVE = random.nextInt(cve.length);
            int select_severity = random.nextInt(severities.length);

            if (i< 3) {
                SecurityTicket security1 = new SecurityTicket(i, description[select_description], resolution[select_resolution], cve[select_CVE], severities[select_severity]);
                System.out.println("Random String selected: " + security1);
            }

            else if (i< 6){
                BestPracticeTicket  BestPracticeTicket1 = new  BestPracticeTicket(i, description[select_description], resolution[select_resolution], cve[select_CVE], severities[select_severity]);
                System.out.println("Random String selected: " +  BestPracticeTicket1);

            }
            else {
                ConfigurationTicket  ConfigurationTicket1 = new  ConfigurationTicket(i, description[select_description], resolution[select_resolution], severities[select_severity]);
                System.out.println("Random String selected: " +  ConfigurationTicket1);
            }

    }



    }
}
