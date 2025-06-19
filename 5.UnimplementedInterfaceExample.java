interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        // Thực hiện vẽ hình tròn ở đây
        System.out.println("Drawing a circle");
    }
}
