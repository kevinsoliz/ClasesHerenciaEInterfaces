package com.Inheritance;

public class UIControl {
    private boolean isEnabled = true;

//    public UIControl(boolean isEnabled) {
//      this.isEnabled = isEnabled;
//        System.out.println("UIControl yeah");
//    }


    public final void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void render(){
        // lo dejamos vacio, cada hijo renderizara de una manera especifiac
    }
}
