package com.desmond.data.ExtraClass;

import java.util.function.Predicate;

/**
 * Created by desmond on 2/5/2017.
 */
public class SamplePredicate<t> implements Predicate<t> {
    public t var1;
    public boolean test(t var){
        if(var1.equals(var)){
            return true;
        }
        return false;
    }
}
