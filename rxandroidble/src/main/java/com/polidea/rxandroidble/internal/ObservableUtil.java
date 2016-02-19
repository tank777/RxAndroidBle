package com.polidea.rxandroidble.internal;

import rx.Observable;

public class ObservableUtil {

    public static <T> Observable<T> justOnNext(T onNext) {
        return Observable.create(subscriber -> subscriber.onNext(onNext));
    }
}
