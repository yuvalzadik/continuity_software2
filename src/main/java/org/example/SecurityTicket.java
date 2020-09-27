
package org.example;
import org.example.ITicket;
import org.example.ITicketCVE;
import org.example.ITicketSeverity;

public class SecurityTicket  implements ITicket, ITicketCVE, ITicketSeverity {

    private final String CVE;
    private final String description;
    private final String resolution;
    private final Severity severity;
    private final int id;

    @Override
    public String getCVE() {
        return CVE;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public Severity getSeverity() {
        return severity;
    }

    @Override
    public int getId() {
        return id;
    }


    public SecurityTicket(int id, String description, String resolution, String CVE, Severity severity) {
        this.id = id;
        this.description = description;
        this.resolution = resolution;
        this.CVE = CVE;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "SecurityTicket{" +
                ", id=" + id +
                ", description='" + description + '\'' +
                ", resolution='" + resolution + '\'' +
                "CVE='" + CVE + '\'' +
                ", severity=" + severity +
                '}';
    }
}
