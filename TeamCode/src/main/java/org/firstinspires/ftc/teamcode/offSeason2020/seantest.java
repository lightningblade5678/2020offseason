package org.firstinspires.ftc.teamcode.offSeason2020;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp

public class seantest extends OpMode{
    public DcMotor arm;

    @Override

    public void init() {
        arm = hardwareMap.get(DcMotor.class, "demiseArm");
        arm.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    public void loop() {
        if (gamepad1.right_stick_y > 0.2 || gamepad1.right_stick_y < -0.2) {
            arm.setPower(gamepad1.right_stick_y);
        }
        else if (gamepad1.right_stick_y < 0.2 && gamepad1.right_stick_y > -0.2) {
            arm.setPower(0.0);
        }
    }

}
