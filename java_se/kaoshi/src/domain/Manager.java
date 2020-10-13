package domain;

import java.io.Serializable;
import java.util.Objects;

//管理人员（工号，姓名，性别，手机号）
public class Manager implements Serializable {
   private String gonghao;
   private String name;
   private String xingbie;
   private String phone;

    public Manager() {
    }

    public Manager(String gonghao, String name, String xingbie, String phone) {
        this.gonghao = gonghao;
        this.name = name;
        this.xingbie = xingbie;
        this.phone = phone;
    }

    public String getGonghao() {
        return gonghao;
    }

    public void setGonghao(String gonghao) {
        this.gonghao = gonghao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return Objects.equals(gonghao, manager.gonghao) &&
                Objects.equals(name, manager.name) &&
                Objects.equals(xingbie, manager.xingbie) &&
                Objects.equals(phone, manager.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gonghao, name, xingbie, phone);
    }

    @Override
    public String toString() {
        return "ManagerChoose{" +
                "gonghao='" + gonghao + '\'' +
                ", name='" + name + '\'' +
                ", xingbie='" + xingbie + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
