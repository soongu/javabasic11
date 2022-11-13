package org.example.encap;


import org.example.inter.Danceable;

public abstract class Dancer extends Object implements Danceable {

    private String crewName; // 팀의 이름
    Grade grade; // 실력
    String myName; // 내 이름

    private double height; // 키

//    public Dancer() {
//    }

    public Dancer(String crewName, Grade grade, String myName) {
        this.crewName = crewName;
        this.grade = grade;
        this.myName = myName;
    }

    // 스트레칭
    private void stretch() {
        System.out.println(myName + "이 몸을 풉니다.");
    }

    // 유연성 연습
    private void moreFlexible() {
        System.out.println(myName + "이 다리를 찢습니다.");
    }


    public void setHeight(double height) {
        if (height <= 130 || height >= 250) {
            this.height = 160;
            return;
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "crewName='" + crewName + '\'' +
                ", grade=" + grade +
                ", myName='" + myName + '\'' +
                ", height=" + height +
                '}';
    }
}
