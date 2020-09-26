public class BestPracticeTicket implements ITicket, ITicketCVE,ITicketSeverity{


    private  String CVE;
    private  String description;
    private  String resolution;
    private  Severity severity;
    private   int id;

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

    public BestPracticeTicket(int id, String description, String resolution, String CVE, Severity severity) {
        this.id = id;
        this.description = description;
        this.resolution = resolution;
        this.CVE = CVE;
        this.severity = severity;


    }
}
