public class ConfigurationTicket implements ITicket,ITicketSeverity {

    private String description;
    private String resolution;
    private Severity severity;
    private int id;

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

    public ConfigurationTicket(int id, String description, String resolution, String CVE, Severity severity) {
        this.id = id;
        this.description = description;
        this.resolution = resolution;
        this.severity = severity;
    }
}
