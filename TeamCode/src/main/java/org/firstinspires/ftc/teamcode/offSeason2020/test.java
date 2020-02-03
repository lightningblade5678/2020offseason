package org.firstinspires.ftc.teamcode.offSeason2020;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp
public class test extends OpMode {

    private DcMotor works;

    @Override

    public void init(){
        works = hardwareMap.get(DcMotor.class,"tests");
    }

    public void loop(){
        if(gamepad1.a){
            works.setPower(1);
        }

    }
}
