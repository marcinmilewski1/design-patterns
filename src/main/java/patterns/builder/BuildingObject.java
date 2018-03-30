package patterns.builder;

public class BuildingObject {
    private Integer value1;
    private Integer value2;
    private String value3;

    public Integer getValue1() {
        return value1;
    }

    public Integer getValue2() {
        return value2;
    }

    public String getValue3() {
        return value3;
    }

    private BuildingObject(Builder b) {
        this.value1 = b.value1;
        this.value2 = b.value2;
        this.value3 = b.value3;


    }

    public static final class Builder {
        private Integer value1;
        private Integer value2;
        private String value3;

        public Builder setValue1(Integer value1) {
            this.value1 = value1;
            return this;
        }

        public Builder setValue2(Integer value2) {
            this.value2 = value2;
            return this;
        }

        public Builder setValue3(String value3) {
            this.value3 = value3;
            return this;
        }

        public BuildingObject build() {
            return new BuildingObject(this);
        }
    }
}
