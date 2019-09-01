package yeh.pratice;

import java.util.ArrayList;
import java.util.List;

public class ReportTest {
    public static void main(String[] args) {
        Report finance=new FinanceReport();
        Report heath=new HeathReport();
        List<Report> reports=new ArrayList<>();
        reports.add(finance);
        reports.add(heath);
        for(Report report:reports){
            report.load();
            report.print();
        }
    }
}
