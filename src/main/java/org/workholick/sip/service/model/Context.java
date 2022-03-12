package org.workholick.sip.service.model;

import java.util.Map;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 10-03-2022
 **/
public interface Context <T extends Object>{

    /**
     * returns context.
     * @return
     */
    public Map<String,T> getContext();

    /**
     * Returns instance present against the key in the context.
     * @param key
     */
    public default T get(String key){
        return getContext()!=null?getContext().get(key):null;
    }

    /**
     * Puts data into the context against the key.
     * @param key
     * @param data
     */
    public default void put(String key, T data){
        if(getContext()==null){
            throw new NullPointerException("Context is null.");
        }
        getContext().put(key,data);
    }

    /**
     * Add all the objects in the context.
     * @param context
     */
    public default void addAll(Context<T> context){
        if(getContext()==null){
            throw new NullPointerException("Context is null.");
        }
        if(context!=null) {
            context.getContext().entrySet().forEach(entry->getContext().put(entry.getKey(), entry.getValue()));
        }
    }

}
