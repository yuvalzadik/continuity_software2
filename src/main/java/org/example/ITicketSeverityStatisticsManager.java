package org.example;

import org.example.ITicketSeverity;

public interface ITicketSeverityStatisticsManager {
    void addTicketForAnalyzing(ITicketSeverity tickets);
    String calcStatistics();
    String calcCVEStatistics();

}
