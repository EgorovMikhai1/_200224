package org.example.unit;

import java.lang.reflect.Method;

public interface CarAble {
    void start();
    void stop();
}

class RealCar implements CarAble {

    @Override
    public void start() {
        System.out.println("RealCar start");
    }

    @Override
    public void stop() {
        System.out.println("RealCar stop");
    }
}

class ProxyCar implements CarAble {

    private CarAble realCar;

    public ProxyCar(CarAble carAble) {
        this.realCar = carAble;
    }


    @Override
    public void start() {
        System.out.println("ProxyCar start + logging");
        realCar.start();

    }

    @Override
    public void stop() {
        System.out.println("ProxyCar stop + logging");
        realCar.stop();
    }
}

class Main {
    public static void main(String[] args) {
        RealCar realCar = new RealCar();
        ProxyCar proxyCar = new ProxyCar(realCar);

        proxyCar.start();
    }
}
