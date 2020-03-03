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

    public void loop() {

        if (gamepad1.right_stick_y > 0) {
            frontRight.setPower(1);
            frontLeft.setPower(-1);
            backRight.setPower(1);
            backLeft.setPower(-1);

        }
        if (gamepad1.right_stick_y == 0) {
            frontRight.setPower(0);
            frontLeft.setPower(0);
            backRight.setPower(0);
            backLeft.setPower(0);

        }

        else if (gamepad1.right_stick_y < 0) {
            frontRight.setPower(-1);
            frontLeft.setPower(1);
            backRight.setPower(-1);
            backLeft.setPower(1);

        }

        if (gamepad1.right_stick_y == 0) {
            frontRight.setPower(0);
            frontLeft.setPower(0);
            backRight.setPower(0);
            backLeft.setPower(0);

        }
        if (gamepad1.right_stick_x > 0) {
            frontRight.setPower(1);
            frontLeft.setPower(1);
            backRight.setPower(-1);
            backLeft.setPower(-1);

        }
        if (gamepad1.right_stick_x == 0) {
            frontRight.setPower(0);
            frontLeft.setPower(0);
            backRight.setPower(0);
            backLeft.setPower(0);


        } else if (gamepad1.right_stick_x < 0){
            frontRight.setPower(-1);
            frontLeft.setPower(-1);
            backRight.setPower(1);
            backLeft.setPower(1);

        }
        if (gamepad1.right_stick_x == 0) {
            frontRight.setPower(0);
            frontLeft.setPower(0);
            backRight.setPower(0);
            backLeft.setPower(0);

        }



        }
    }


