package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;

    public static ExtentReports getExtent() {

        if (extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter("reports/ExtentReport.html");

            spark.config().setReportName("Automation Web Page Test Report");
            spark.config().setDocumentTitle("DemoQA Web Automation");

            extent = new ExtentReports();
            extent.attachReporter(spark);
        }
        return extent;
    }
}
