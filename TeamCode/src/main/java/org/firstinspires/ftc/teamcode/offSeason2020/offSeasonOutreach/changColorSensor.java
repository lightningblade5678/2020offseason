package org.firstinspires.ftc.teamcode.offSeason2020.offSeasonOutreach;

import com.qualcomm.hardware.*;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;

public class changColorSensor extends LinearOpMode{


    public ColorSensor test;

    @Override

    public void runOpMode(){

        test = hardwareMap.get(ColorSensor.class,"light");

        while(opModeIsActive()){
            telemetry.addData("RGB Value",test.alpha());
            telemetry.update();
        }

    }

}
