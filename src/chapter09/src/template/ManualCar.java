package template;

public class ManualCar extends Car{
    @Override
    public void stop() {
        System.out.println("브레이크로 정지하기");
    }

    @Override
    public void drive() {
        System.out.println("사람이 운전하기");
    }

    @Override
    public void wiper() {
        System.out.println("사람이 빠르기를 조절합니다.");
    }
}
