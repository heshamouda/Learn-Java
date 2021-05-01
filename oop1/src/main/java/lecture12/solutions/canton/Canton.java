package lecture12.solutions.canton;

public enum Canton {
    AG(611466, 1403.8, "German"), AR(53017, 242.9, "German"), AI(14688, 172.5, "German"),
    BL(274404, 527.5, "German"), BS(184950, 37.1, "German"), BE(979802, 5959.1, "German"),
    GL(38608, 685.4, "German"), GR(192621, 7105.2, "German"), LU(377610, 1493.5, "German"),
    FR(278493, 1670.8, "French"), GE(457715, 282.4, "French"), JU(70032, 838.8, "French"),
    NE(172085, 803.1, "French"),
    NW(41024, 276.1, "German"), OW(35585, 490.6, "German"), SH(76356, 298.5, "German"),
    SZ(146730, 908.2, "German"), SO(255284, 790.5, "German"), SG(478907, 2025.4, "German"),
    TG(248444, 990.9, "German"), UR(35422, 1076.4, "German"), ZG(113105, 238.8, "German"),
    ZH(1373068, 1728.8, "German"),
    VD(713281, 3212.1, "French"), VS(312684, 5224.4, "German"), TI(333753, 2812.5, "Italian");

    private long inhabitants;
    private double size;
    private String language;

    private Canton(long i, double s, String language) {
        this.inhabitants = i;
        this.size = s;
        this.language = language;
    }

    public long getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(long inhabitants) {
        this.inhabitants = inhabitants;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getLanguage() {
        return language;
    }
}
