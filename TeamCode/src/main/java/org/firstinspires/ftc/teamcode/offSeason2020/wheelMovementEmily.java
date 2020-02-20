package org.firstinspires.ftc.teamcode.offSeason2020;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp

public class wheelMovementEmily extends OpMode{
    private DcMotor frontRight;
    private DcMotor frontLeft;
    private DcMotor backRight;
    private DcMotor backLeft;
    private DcMotor intakeRight;
    private DcMotor intakeLeft;
    private double tolerance = .5;

    @Override

    public void init() {
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        backRight = hardwareMap.get(DcMotor.class, "backRight");
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        intakeRight = hardwareMap.get(DcMotor.class, "intakeRight");
        intakeLeft = hardwareMap.get(DcMotor.class, "intakeLeft");
    }
    public void loop(){
        if(gamepad1.left_stick_y > 0 && gamepad1.left_stick_x > -.3 && gamepad1.left_stick_x < .3)//going forwards
        {
            frontLeft.setPower(-1);
            frontRight.setPower(1);
            backRight.setPower(1);
            backLeft.setPower(-1);
        }
        else if(gamepad1.left_stick_y < 0 && gamepad1.left_stick_x > -.3 && gamepad1.left_stick_x < .3)//going backwards
        {
            frontLeft.setPower(1);
            frontRight.setPower(-1);
            backRight.setPower(-1);
            backLeft.setPower(1);
        }
        else if(gamepad1.left_stick_x > .3)//right
        {
            frontLeft.setPower(1);
            frontRight.setPower(1);
            backRight.setPower(-1);
            backLeft.setPower(-1);
        }
        else if(gamepad1.left_stick_x < -.3)//left
        {
            frontLeft.setPower(-1);
            frontRight.setPower(-1);
            backRight.setPower(1);
            backLeft.setPower(1);
        }
        if(gamepad1.right_stick_y > 0)//rotate right, change condition statements
        {
            frontLeft.setPower(-1);
            frontRight.setPower(-1);
            backRight.setPower(-1);
            backLeft.setPower(-1);
        }
        if(gamepad1.right_stick_y < 0)//rotate left, change condition statements
        {
            frontLeft.setPower(1);
            frontRight.setPower(1);
            backRight.setPower(1);
            backLeft.setPower(1);
        }
        if(Math.pow(gamepad1.right_stick_x, 2) <= 0.01 && Math.pow(gamepad1.right_stick_y, 2) <= 0.01)
        {
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backRight.setPower(0);
            backLeft.setPower(0);
        }
        if(gamepad1.dpad_up) //spit out
        {
            intakeRight.setPower(.5);
            intakeLeft.setPower(-.5);
        }

        if(gamepad1.dpad_down)//spit in
        {
            intakeRight.setPower(-.5);
            intakeLeft.setPower(.5);
        }
    }
}
