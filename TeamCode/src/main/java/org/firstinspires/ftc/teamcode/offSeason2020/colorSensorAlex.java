package org.firstinspires.ftc.teamcode.offSeason2020;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
public class colorSensorAlex extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {


        ColorSensor color_sensor;
        public void init () {
            color_sensor = hardwareMap.colorSensor.get("color");

        }

        @Override
        public void loop () {
            color_sensor.argb();
        }


    }
}
