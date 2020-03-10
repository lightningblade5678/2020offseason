package org.firstinspires.ftc.teamcode.offSeason2020.sensors;

import com.qualcomm.hardware.*;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;

@TeleOp
public class colorSensorTest extends LinearOpMode{

    public ColorSensor test;

    @Override

    public void runOpMode(){

        test = hardwareMap.get(ColorSensor.class,"light");

        waitForStart();

        while(opModeIsActive()){
            telemetry.addData("RGB Value",test.alpha());
            telemetry.update();
        }

    }

}

