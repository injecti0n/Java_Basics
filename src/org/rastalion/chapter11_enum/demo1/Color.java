package org.rastalion.chapter11_enum.demo1;

public enum Color {

    BLACK(0x00_00_00) {
        @Override
        public String toString () {
            return "$classname{" +
                    "rgb=" + this.getRgb() +
                    '}';
        }
    },
    WHITE(0xFF_FF_FF),
    RED(0xFF_00_00),
    GREEN(0x00_FF_00),
    BLUE(0x00_00_FF),
    YELLOW(0xFF_FF_00);

    protected int rgb;

    Color (int rgb) {
        this.rgb = rgb;
    }

    protected int getRgb () {
        return rgb;
    }

    private void setRgb (int rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString () {
        return name().toLowerCase();
    }
}
