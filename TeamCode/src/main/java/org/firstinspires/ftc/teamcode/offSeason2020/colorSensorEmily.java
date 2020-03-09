package org.firstinspires.ftc.teamcode.offSeason2020;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@TeleOp

public class colorSensorEmily extends LinearOpMode {
    private ColorSensor colorSensor;

    @Override

    public void runOpMode()
    {
        colorSensor = hardwareMap.colorSensor.get("Color");
        colorSensor.alpha();
        colorSensor.argb();
        int b = 1;
        waitForStart();


    }

}
