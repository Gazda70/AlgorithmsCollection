package com.gazda.algorithms.graph.model.metric;

import java.util.stream.IntStream;
import java.lang.Math;

public class EuclideanMetric extends Metric{
    private final Integer numberOfDimensions;
    private final Double[] firstPoint;
    private final Double[] secondPoint;

    public EuclideanMetric(final Integer numberOfDimensions, final Double[] firstPoint, final Double[] secondPoint){
        this.numberOfDimensions = numberOfDimensions;
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    @Override
    public Double calculateDistance(){
        return Math.sqrt(IntStream.range(0, numberOfDimensions)
                .mapToObj(index -> Math.pow((firstPoint[index] - secondPoint[index]), 2))
                .reduce(0.0, Double::sum));
    }
}
