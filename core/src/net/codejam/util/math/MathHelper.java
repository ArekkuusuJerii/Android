package net.codejam.util.math;

/**
 * This file was created by Snack on 23/01/2017. It's distributed as part of MindFlex.
 * Get the source code in GitHub: https://github.com/ArekkuusuJerii/MindFlex
 * MidFlex is open source, and is distributed under the MIT licence.
 */

public final class MathHelper {

    private MathHelper(){}

    public static double sinAngleModifier(double maxUpAndDown, double speed, double angle, double tick) {
        double toDegrees = Math.PI / 180D;
        angle += speed * tick;
        if (angle > 360) angle -= 360;
        return maxUpAndDown * Math.sin(angle * toDegrees);
    }

    public static double cosAngleModifier(double maxUpAndDown, double speed, double angle, double tick) {
        double toDegrees = Math.PI / 180D;
        angle += speed * tick;
        if (angle > 360) angle -= 360;
        return maxUpAndDown * Math.cos(angle * toDegrees);
    }

    public static float sinAngleModifier(float maxUpAndDown, float speed, float angle, float tick) {
        float toDegrees = (float) Math.PI / 180F;
        angle += speed * tick;
        if (angle > 360) angle -= 360;
        return maxUpAndDown * (float) Math.sin(angle * toDegrees);
    }

    public static float cosAngleModifier(float maxUpAndDown, float speed, float angle, float tick) {
        float toDegrees = (float) Math.PI / 180F;
        angle += speed * tick;
        if (angle > 360) angle -= 360;
        return maxUpAndDown * (float) Math.cos(angle * toDegrees);
    }

    public static int clamp_int(int num, int min, int max) {
        return num > min ? (num < max ? num : max) : min;
    }

    public static float clamp_float(float num, float min, float max) {
        return num > min ? (num < max ? num : max) : min;
    }

    public static double clamp_double(double num, double min, double max) {
        return num > min ? (num < max ? num : max) : min;
    }
}
