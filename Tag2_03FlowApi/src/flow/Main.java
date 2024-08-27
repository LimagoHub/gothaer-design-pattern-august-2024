package flow;

import de.subscriber.EndSubscriber;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newFixedThreadPool(3);

        List<String> liste = List.of("1","2","drei","4","fuenf","1","2","drei","4","fuenf");

        EndSubscriber<String> endSubscriber = new EndSubscriber<>();

        SubmissionPublisher<String> publisher = new SubmissionPublisher<>(service, 100);

        publisher.subscribe(endSubscriber);

        liste.forEach(publisher::submit);

        publisher.close();

        //var service = (ExecutorService) publisher.getExecutor();
        service.shutdown();
        service.awaitTermination(1000, TimeUnit.DAYS);

        System.out.println("Ende");

    }
}