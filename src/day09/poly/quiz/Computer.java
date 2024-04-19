package day09.poly.quiz;

public class Computer {
    private ComputerPart[] parts;

    public Computer() {
        // 초기 부품 배열의 크기를 0으로 설정
        this.parts = new ComputerPart[0];
    }

    // 부품 추가 메소드
    public void addPart(ComputerPart part) {
        // ComputerPart[] 에 부품 추가

        ComputerPart[] newParts = new ComputerPart[parts.length + 1];

        for (int i = 0; i < parts.length; i++) {
            newParts[i] = parts[i];
        }

        newParts[parts.length] = part;
        parts = newParts;
    }

    // 모든 부품 정보 출력 메소드
    public void showParts() {

        for (ComputerPart part : parts) {
            part.describePart();
        }

    }

}
