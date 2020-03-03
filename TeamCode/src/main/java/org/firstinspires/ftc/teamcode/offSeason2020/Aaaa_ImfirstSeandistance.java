package org.firstinspires.ftc.teamcode.offSeason2020;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@TeleOp

public class Aaaa_ImfirstSeandistance extends LinearOpMode {
    public DistanceSensor distance;

    @Override

    public void runOpMode() throws InterruptedException {
        distance = hardwareMap.get(DistanceSensor.class, "distance");

        waitForStart();

        while (opModeIsActive()){
            distance.getDistance(DistanceUnit.CM);
        }
    }
}
