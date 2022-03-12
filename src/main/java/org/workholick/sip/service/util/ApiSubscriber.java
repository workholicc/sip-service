package org.workholick.sip.service.util;

import org.reactivestreams.Subscriber;

import java.util.Queue;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 11-03-2022
 **/
public interface ApiSubscriber<T extends Object> extends Subscriber<T> {

    @Override
    default void onComplete(){
        processFinished();
    }

    @Override
    default void onError(Throwable t){

    }

    @Override
    default void onNext(T o){
        putData(o);
    }

    /**
     * Holds data.
     * @param holder
     */
    public void setDataHolder(Object holder);

    /**
     * Put data into the data holder.
     * @param data
     */
    public void putData(T data);

    /**
     * Indicates process finished..
     */
    public void processFinished();
}
