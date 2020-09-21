package com.softserve.academy.sprint03.task05;

public enum ClientType {
    NEW(1) {
        @Override
        public double discount() {
            return 0.1;
        }
    },
    SILVER(12) {
        @Override
        public double discount() {
            return (100 - 12 * 0.25) / 100;
        }
    },
    GOLD(30) {
        @Override
        public double discount() {
            return (100 - 12 * 0.3) / 100;
        }
    },
    PLATINUM(60) {
        @Override
        public double discount() {
            return (100 - 12 * 0.35) / 100;
        }
    };

    private final int months;

    ClientType(int months) {
        this.months = months;
    }

    public abstract double discount();
}
