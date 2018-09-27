/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th03;

/**
 *
 * @author huyhabidien
 */
public class PhanSo {

    private int tu, mau;

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getTu() {
        return tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int getMau() {
        return mau;
    }
    public int UCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        else
            return UCLN(b, a % b);
    }
    
    
    public void PhanSoToiGian() {
        int i = UCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }

    public void congPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.PhanSoToiGian();
        System.out.println("Tong Ps = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }

    public void truPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoHieu = new PhanSo(ts, ms);
        phanSoHieu.PhanSoToiGian();
        System.out.println("Hieu PS = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }

    public void nhanPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoTich = new PhanSo(ts, ms);
        phanSoTich.PhanSoToiGian();
        System.out.println("Tich Ps = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }

    public void chiaPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        PhanSo phanSoThuong = new PhanSo(ts, ms);
        phanSoThuong.PhanSoToiGian();
        System.out.println("Thuong = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }

    public boolean equals(Object obj) {
        if (obj instanceof PhanSo) {
            PhanSo other = (PhanSo) obj;
            if (this.getTu() * other.getMau() == this.getMau() * other.getTu()) {
                return true;
            } 
            else {
                return false;
            }
        }
        else {
            return false;
        }

    }
}
