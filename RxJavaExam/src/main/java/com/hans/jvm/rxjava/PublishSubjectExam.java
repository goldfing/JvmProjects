package com.hans.jvm.rxjava;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.subjects.PublishSubject;

public class PublishSubjectExam {
    public static void main(String[] args) {
        PublishSubjectExam exam = new PublishSubjectExam();

        exam.helloWorld();
        System.out.println("\n=========================");

        exam.exam2();
    }

    public void helloWorld() {
        PublishSubject<String> stringPublishSubject = PublishSubject.create();

        Subscription subscriptionPrint = stringPublishSubject.subscribe(new Observer<String>() {
            @Override
            public void onCompleted() {
                System.out.println("Observable completed");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Observable Error!");
            }

            @Override
            public void onNext(String s) {
                System.out.println(s);
            }
        });

        stringPublishSubject.onNext("Hello World!");
    }

    public void exam2() {
        final PublishSubject<Boolean> subject = PublishSubject.create();
        subject.subscribe(new Observer<Boolean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Boolean aBoolean) {
                System.out.println("Obsevable completed!");
            }
        });

        Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                for (int i = 0 ; i < 5 ; i++) {
                    subscriber.onNext(i);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                subscriber.onCompleted();
            }
        }).doOnCompleted(new Action0() {
            @Override
            public void call() {
                subject.onNext(true);
            }
        }).subscribe();
    }
}
