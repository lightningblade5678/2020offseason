package org.firstinspires.ftc.teamcode.offSeason2020;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.internal.network.DeviceNameListener;

@TeleOp
public class AlexWheels extends OpMode {

    private DcMotor frontLeft, frontRight, backLeft, backRight;

    @Override
    public void init() {

        frontLeft = hardwareMap.get(DcMotor.class, "AlexWheels");
        frontRight = hardwareMap.get(DcMotor.class, "AlexWheels");
        backLeft = hardwareMap.get(DcMotor.class, "AlexWheels");
        backRight
                = hardwareMap.get(DcMotor.class, "AlexWheels");
    }
  public void loop() {
        if(gamepad1.left_stick_y > 0.2) {
           frontLeft.setPower(1);
            backLeft.setPower(1);
            frontRight.setPower(1);
            backRight.setPower(1);
        }
      if(gamepad1.left_stick_y > -0.2) {
          frontLeft.setPower(-1);
          backLeft.setPower(-1);
          frontRight.setPower(-1);
          backRight.setPower(-1);
      }
      if(gamepad1.left_stick_y == 0) {
          frontLeft.setPower(0);
          frontRight.setPower(0);
          backRight.setPower(0);
          backLeft.setPower(0);
      }
    }


    }











