package de.subscriber;
import java.util.concurrent.Flow;

import static java.util.concurrent.Flow.*;

public class EndSubscriber<T> implements Subscriber<T> {
    private Subscription subscription;

    @Override
    public void onSubscribe(final Subscription subscription) {
        this.subscription =subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(final T item) {
        System.out.println(item);
        subscription.request(1);
    }

    @Override
    public void onError(final Throwable throwable) {
        System.out.println(throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("Subscriber completed");
    }
}
