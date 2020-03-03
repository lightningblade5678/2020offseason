package org.firstinspires.ftc.teamcode.offSeason2020.offSeasonOutreach;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.internal.network.DeviceNameListener;

@TeleOp
public class treadBotMovement extends OpMode {

    private DcMotor left, right;

    public void init() {
        right = hardwareMap.get(DcMotor.class, "treadBotMovement");
        left = hardwareMap.get(DcMotor.class, "treadBotMovement");

    }

    public void loop() {
        if (gamepad1.left_stick_y > 0.2) {
            right.setPower(1);
            left.setPower(1);
        }
        if (gamepad1.left_stick_y < -0.2) {
            right.setPower(-1);
            left.setPower(-1);
        }
        if (gamepad1.left_stick_x > 0.2) {
            right.setPower(-1);
            left.setPower(1);
        }
        if (gamepad1.left_stick_x < -0.2) {
            right.setPower(1);
            left.setPower(-1);
        }

    }
}

