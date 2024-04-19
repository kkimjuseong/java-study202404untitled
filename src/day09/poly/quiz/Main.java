package day09.poly.quiz;

public class Main {
    public static void main(String[] args) {
        Computer myComputer = new Computer();
        myComputer.addPart(new Processor("Intel i7", 320000));
        myComputer.addPart(new Processor("Intel i9", 520000));
        myComputer.addPart(new Memory("Corsair Vengeance 16GB", 90000));
        myComputer.addPart(new Memory("Corsair Vengeance 32GB", 14000));
        myComputer.addPart(new HardDrive("Samsung SSD 1TB", 150000));
        myComputer.addPart(new HardDrive("Samsung SSD 2TB", 220000));

        myComputer.showParts();
    }
}
