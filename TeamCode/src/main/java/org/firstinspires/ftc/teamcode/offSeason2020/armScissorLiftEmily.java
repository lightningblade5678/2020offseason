package org.firstinspires.ftc.teamcode.offSeason2020;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@TeleOp

public class armScissorLiftEmily extends LinearOpMode {
    private DcMotor scissorLift;
    private DcMotor armStop;

    @Override

    public void runOpMode() throws InterruptedException{
        scissorLift = hardwareMap.get(DcMotor.class, "scissorLift");
        armStop = hardwareMap.get(DcMotor.class, "armStop");
        waitForStart();

        if(gamepad2.a)
        {
            scissorLift.setPower(1);
            mySleep(2000, "scissorLift stretch");
            scissorLift.setPower(0);
        }
        else if (gamepad2.b)
        {
            scissorLift.setPower(-1);
            mySleep(2000, "scissorLift compress");
            scissorLift.setPower(0);
        }
        if(gamepad2.x)
        {
            armStop.setPower(1);
            mySleep(2000, "arm down");
            scissorLift.setPower(0);
        }
        else if(gamepad2.y)
        {
            armStop.setPower(-1);
            mySleep(2000, "arm up");
            scissorLift.setPower(0);
        }
    }
    public void mySleep(long interval, String msg) {
        ElapsedTime myTimer = new ElapsedTime(ElapsedTime.Resolution.MILLISECONDS);
        while (myTimer.milliseconds() < interval && opModeIsActive()) {
            telemetry.addData("Elapsed Time (msec)", "%.00f", myTimer.milliseconds());
            telemetry.addData("mySleep", msg);
            telemetry.update();
            this.sleep(250);
        }
    }
}