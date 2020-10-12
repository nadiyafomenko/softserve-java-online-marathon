package com.softserve.academy.sprint06.task04;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public List<DecisionMethod> clients = new ArrayList<>();

    public int sale(String product, int percent) {
        return (int) clients.stream().filter(client -> client.decide(product, percent)).count();
    }
}
