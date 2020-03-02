package chapter2.item3.enumtype;

public enum  Elvis {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("기다려! 지금 나갈게");
    }

    // 이 메서드는 바깥에서 작성되어야 한다.
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

}
