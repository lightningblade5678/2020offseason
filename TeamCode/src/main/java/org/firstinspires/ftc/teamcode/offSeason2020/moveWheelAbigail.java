package org.firstinspires.ftc.teamcode.offSeason2020;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp



public class moveWheelAbigail extends OpMode {
        public DcMotor frontRight;
        public DcMotor frontLeft;
        public DcMotor backRight;
        public DcMotor backLeft;

        @Override

public void init() {
            frontRight = hardwareMap.get(DcMotor.class, "frontRight");
            frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
            backRight = hardwareMap.get(DcMotor.class, "backRight");
            backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        }
public void loop(){

if (gamepad1.left_stick_y> 0){
    
}


    }
    }


