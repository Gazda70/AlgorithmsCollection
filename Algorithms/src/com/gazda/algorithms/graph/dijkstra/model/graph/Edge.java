package com.gazda.algorithms.graph.dijkstra.model.graph;

import com.gazda.algorithms.graph.dijkstra.model.metric.Metric;

public class Edge {
    private Vertex firstVertex;
    private Vertex secondVertex;
    private Boolean isDirected;
    private Boolean firstToSecond;
    private Boolean secondToFirst;
    private Metric weight;
}
