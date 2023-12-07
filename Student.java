
package studentservice;

public class Student {
  private String maSV;
  private String tenSV;
  private Boolean gioitinh;
  private int namsinh;

    public Student() {
    }

    public Student(String maSV, String tenSV, Boolean gioitinh, int namsinh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public Boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    @Override
    public String toString() {
        return "Student{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", gioitinh=" + gioitinh + ", namsinh=" + namsinh + '}';
    }
  
}
