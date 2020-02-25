package org.firstinspires.ftc.teamcode.offSeason2020;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.internal.network.DeviceNameListener;

@TeleOp
public class AlexWheels extends OpMode {

    private DcMotor works;

    @Override
    public void init() {

        works = hardwareMap.get(DcMotor.class, "AlexWheels");
    }
  public void loop() {
        if(gamepad1.left_stick_y > 0.2) {
            works.setPower(1);
        }
      if(gamepad1.left_stick_y > -0.2) {
          works.setPower(-1);
      }
      if(gamepad1.left_stick_y == 0) {
          works.setPower(0);
      }
    }


    }










}
