package ru.netology;

public class Tumbler {
    private volatile boolean boxClosed;

    public boolean getBoxClosed() {
        return boxClosed;
    }

    public void setBoxClosed(boolean boxClosed) {
        this.boxClosed = boxClosed;
    }
}
