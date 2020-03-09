package org.firstinspires.ftc.teamcode.offSeason2020.offSeasonOutreach;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.ColorSensor;
@TeleOp

public class colorSensorAbigail extends LinearOpMode {
    private DcMotor motor;
    private ColorSensor color_sensor;

    @Override

    
    public void init(){

        motor = hardwareMap.get(DcMotor.class, "motor");
        color_sensor = hardwareMap.colorSensor.get("color");

    }

    public void loop(){
        color_sensor.alpha(); // Total luminosity
        color_sensor.argb(); // Combined color value


        if(color_sensor.argb() == 255170029){
            motor.setPower(1);
        } else {
            motor.setPower(0);

        }
    }

}
