package com.softserve.academy.sprint03.task05;

public enum ClientType {
    NEW(1), SILVER(12), GOLD(30), PLATINUM(60);

    private int months;

    ClientType(int months) {
        this.months = months;
    }
    public double discount() {
        switch (this.months){
            case 12: return (100 - 12 * 0.25) / 100;
            case 30: return (100 - 30 * 0.3) / 100;
            case 60: return (100 - 60 * 0.35) / 100;
            default: return 0.1;
        }
    }
}
