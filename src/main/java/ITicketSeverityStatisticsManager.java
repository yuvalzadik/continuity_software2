import java.util.Collection;

public interface ITicketSeverityStatisticsManager {
    void addTicketForAnalyzing(ITicketSeverity tickets);
    String calcStatistics();
    String calcCVEStatistics();

}
