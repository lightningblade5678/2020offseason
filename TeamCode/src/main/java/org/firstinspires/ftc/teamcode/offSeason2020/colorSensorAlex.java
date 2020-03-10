package org.firstinspires.ftc.teamcode.offSeason2020;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
@TeleOp
public class colorSensorAlex extends LinearOpMode {

    @Override
    public void runOpMode() {
        color_sensor.argb();
        color_sensor.argb();
    }
        ColorSensor color_sensor;
         {
            color_sensor = hardwareMap.colorSensor.get("color");
        }

}





