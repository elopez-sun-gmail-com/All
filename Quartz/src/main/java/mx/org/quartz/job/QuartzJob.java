package mx.org.quartz.job;

/**
 *
 * @author elopez
 */
import java.util.Date;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class QuartzJob implements Job {

    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("Hola " + context.getJobDetail().getJobDataMap().getString("nombre") + " -->> " + new Date());
    }

}
