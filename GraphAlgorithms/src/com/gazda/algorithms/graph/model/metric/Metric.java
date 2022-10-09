package com.gazda.algorithms.graph.model.metric;

public abstract class Metric {
    public Boolean isGreater(){return false;}
    public Boolean isSmaller(){return false;}
    public Boolean isEqual(){return false;}

    public abstract Number calculateDistance();
}
