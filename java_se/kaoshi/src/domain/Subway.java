package domain;

import java.io.Serializable;
import java.util.Objects;

//地铁站（地铁站编号，地铁站名称，所属路线）
public class Subway implements Serializable {
    private String bianhao;
    private String name;
    private String luxian;

    public Subway() {
    }

    public Subway(String bianhao, String name, String luxian) {
        this.bianhao = bianhao;
        this.name = name;
        this.luxian = luxian;
    }

    public String getBianhao() {
        return bianhao;
    }

    public void setBianhao(String bianhao) {
        this.bianhao = bianhao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLuxian() {
        return luxian;
    }

    public void setLuxian(String luxian) {
        this.luxian = luxian;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subway subway = (Subway) o;
        return Objects.equals(bianhao, subway.bianhao) &&
                Objects.equals(name, subway.name) &&
                Objects.equals(luxian, subway.luxian);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bianhao, name, luxian);
    }

    @Override
    public String toString() {
        return "Subway{" +
                "bianhao='" + bianhao + '\'' +
                ", name='" + name + '\'' +
                ", luxian='" + luxian + '\'' +
                '}';
    }
}
