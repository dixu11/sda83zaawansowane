package enums;

class RoadSign {

   private WorldDirection2 direction;


    RoadSign(WorldDirection2 direction) {
        this.direction = direction;
    }

    WorldDirection2 getDirection() {
        return direction;
    }

    public int getDegree() {
      return  direction.getDegree();
    }

    @Override
    public String toString() {
        return "RoadSign{" +
                "direction='" + direction + '\'' +
                '}';
    }
}
