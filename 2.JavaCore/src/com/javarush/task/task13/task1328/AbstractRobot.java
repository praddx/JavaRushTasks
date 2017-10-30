package com.javarush.task.task13.task1328;

public abstract class AbstractRobot  implements Attackable, Defensable {


    private String name;

    private static int hitCount;

    public AbstractRobot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            //  hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        } else {
            attackedBodyPart = BodyPart.CHEST;
            hitCount = 0;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defencedBodyPart = null;
        hitCount = hitCount + 2;

        if (hitCount == 1) {
            defencedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defencedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            //hitCount = 0;
            defencedBodyPart = BodyPart.ARM;
        } else {
            hitCount = 0;
            defencedBodyPart = BodyPart.CHEST;
        }
        return defencedBodyPart;
    }


}
