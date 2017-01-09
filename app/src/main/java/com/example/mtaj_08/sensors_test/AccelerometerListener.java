package com.example.mtaj_08.sensors_test;

/**
 * Created by MTAJ-08 on 1/9/2017.
 */

public interface AccelerometerListener {

    public void onAccelerationChanged(float x, float y, float z);

    public void onShake(float force);

}