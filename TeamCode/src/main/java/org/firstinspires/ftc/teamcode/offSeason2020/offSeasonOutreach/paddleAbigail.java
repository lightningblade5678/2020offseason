package org.firstinspires.ftc.teamcode.offSeason2020.offSeasonOutreach;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp

public class paddleAbigail extends OpMode {

    private DcMotor paddle, servo;

    @Override

    public void init(){

        paddle = hardwareMap.get(DcMotor.class, "paddle");
        servo = hardwareMap.get(DcMotor.class, "servo");

    }

    public void loop(){

        if(gamepad2.right_bumper){ //moves paddle forward

            paddle.setPower(1);
        }
        else if ((gamepad2.right_bumper = false) && (gamepad2.left_bumper = false)){ // stops paddle movement

            paddle.setPower(0);
        }
        if(gamepad2.left_bumper){//moves paddle backward

            paddle.setPower(-1);
        }

        if(gamepad2.dpad_right){ // turns servo right

            servo.setPower(0.5);

        } else if ((gamepad2.dpad_right = false) && (gamepad2.dpad_left = false)){ //stops servo movement

            servo.setPower(0);
        }
        if(gamepad2.dpad_left){ //turns servo left

            servo.setPower(-0.5);
        }
        if(gamepad2.dpad_up){ //sets servo downwards (0degrees)

            servo.setTargetPosition(0);
            servo.setPower(0.5);
        }


    }




}
