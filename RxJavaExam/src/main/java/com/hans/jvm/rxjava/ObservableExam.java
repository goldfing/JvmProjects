package com.hans.jvm.rxjava;


import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.Subscription;

public class ObservableExam {
    public static void main(String[] args) {
        Observable<Integer> observableString = Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                for (int i = 0 ; i < 5 ; i++) {
                    subscriber.onNext(i);
                }

                subscriber.onCompleted();
            }
        });

        Subscription subscriptionPrint = observableString.subscribe(new Observer<Integer>() {
            @Override
            public void onCompleted() {
                System.out.println("Observable completed");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Oh No! Something wrong happend!");
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("Item is " + integer);
            }
        });
    }
}
