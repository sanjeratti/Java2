package oop.interface1.lustra;

public class Shtory implements Pult{
    public int right;
    public int left;

    @Override
    public void moveRight() {
        System.out.println(right++);  // 0  (po umolchaniu 0 (pod kopotom 1di koshtu))
        System.out.println(right++); // 1 (pod kopotom 1di koshtu =2
    }

    @Override
    public void moveLeft() {
        System.out.println(left--);  // 0 (pod kopotom -1)
        System.out.println(left--);  // -1 (pod kopotom -2 stoit)

    }
    @Override
    public void moveDown() {
        System.out.println(++right); // (pod komotom 2 turat) prefiks +1di koshtu =3
        System.out.println(++right); // 4
    }

    @Override
    public void moveUp() {
        System.out.println(++left); // -2+1 = -1 (pod kopotom-2)
        System.out.println(++left); // -1+1 = 0


    }
}
