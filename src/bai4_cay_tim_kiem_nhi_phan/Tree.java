package bai4_cay_tim_kiem_nhi_phan;

public interface Tree<E> {
    public boolean insert(E e);

    public void inorder();

    public int getSize();

}
