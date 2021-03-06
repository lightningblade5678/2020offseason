package org.firstinspires.ftc.teamcode.offSeason2020.offSeasonOutreach;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


@TeleOp

public class wheelBotMovement extends LinearOpMode {
    public DcMotor frontLeft;
    public DcMotor frontRight;
    public DcMotor backLeft;
    public DcMotor backRight;

    @Override

    public void runOpMode() throws InterruptedException {
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        backRight = hardwareMap.get(DcMotor.class, "backRight");

        frontLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        backRight.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.left_stick_y > 0.1 || gamepad1.left_stick_y < -0.1) {
                frontRight.setPower(-gamepad1.left_stick_y);
                frontLeft.setPower(-gamepad1.left_stick_y);
                backRight.setPower(-gamepad1.left_stick_y);
                backLeft.setPower(-gamepad1.left_stick_y);
            } else if (gamepad1.right_stick_x > 0.1 || gamepad1.right_stick_x < -0.1) {
                frontRight.setPower(-gamepad1.right_stick_x);
                frontLeft.setPower(gamepad1.right_stick_x);
                backRight.setPower(-gamepad1.right_stick_x);
                backLeft.setPower(gamepad1.right_stick_x);
            }
            if (gamepad1.left_bumper && gamepad1.right_stick_x < 0.1 && gamepad1.right_stick_x > -0.1 && gamepad1.left_stick_y < 0.1 && gamepad1.left_stick_y > -0.1) {
                frontRight.setPower(1);
                frontLeft.setPower(-1);
                backRight.setPower(-1);
                backLeft.setPower(1);
            } else if (gamepad1.right_bumper && gamepad1.right_stick_x < 0.1 && gamepad1.right_stick_x > -0.1 && gamepad1.left_stick_y < 0.1 && gamepad1.left_stick_y > -0.1) {
                frontRight.setPower(-1);
                frontLeft.setPower(1);
                backRight.setPower(1);
                backLeft.setPower(-1);
            } else if (gamepad1.right_stick_x < 0.1 && gamepad1.right_stick_x > -0.1 && gamepad1.left_stick_y < 0.1 && gamepad1.left_stick_y > -0.1) {
                frontRight.setPower(0);
                frontLeft.setPower(0);
                backRight.setPower(0);
                backLeft.setPower(0);
            }
        }
    }
}
