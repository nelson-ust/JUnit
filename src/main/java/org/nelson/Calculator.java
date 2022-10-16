package org.nelson;
import java.util.stream.DoubleStream;

public class Calculator {
    static double add(double... operands ){
        return DoubleStream.of(operands).sum();
    }
    static double product(double... operands){
        return DoubleStream.of(operands).reduce(1,(a,b)->a*b);
    }
    static double difference(double x, double y){
        return x-y;
    }

}
