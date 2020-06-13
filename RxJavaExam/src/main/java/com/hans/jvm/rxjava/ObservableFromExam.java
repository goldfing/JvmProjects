package com.hans.jvm.rxjava;

import rx.Observable;
import rx.Observer;
import rx.Subscription;

import java.util.ArrayList;
import java.util.List;


public class ObservableFromExam {
    public static void main(String[] args) {
        List<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(10);
        items.add(100);
        items.add(200);

        Observable<Integer> observableString = Observable.from(items);

        Subscription subscriptionPrint = observableString.subscribe(new Observer<Integer>() {
            @Override
            public void onCompleted() {
                System.out.println("Observable completed");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Oh no! Something wrong happend!");
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("Item is " + integer);
            }
        });
    }
}
