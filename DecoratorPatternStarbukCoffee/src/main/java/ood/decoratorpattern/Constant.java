package ood.decoratorpattern;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Constant {
    static Map<String, Double> SOY_SIZE_PRICE = Stream.of(
            new AbstractMap.SimpleEntry<>("tall", 0.10),
            new AbstractMap.SimpleEntry<>("grande,", 0.15),
            new AbstractMap.SimpleEntry<>("venti", 0.20))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    static Map<String, Double> MOCHA_SIZE_PRICE = Stream.of(
            new AbstractMap.SimpleEntry<>("tall", 0.15),
            new AbstractMap.SimpleEntry<>("grande,", 0.20),
            new AbstractMap.SimpleEntry<>("venti", 0.25))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    static Map<String, Double> WHIP_SIZE_PRICE = Stream.of(
            new AbstractMap.SimpleEntry<>("tall", 0.2),
            new AbstractMap.SimpleEntry<>("grande,", 0.25),
            new AbstractMap.SimpleEntry<>("venti", 0.3))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

}
