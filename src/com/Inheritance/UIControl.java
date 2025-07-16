package com.Inheritance;

public abstract class UIControl { //como clase abstracta, todos los hijos que hereden de ella deben implementar los métodos abstractos
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

    public abstract void render();
        // lo dejamos vacio, cada hijo renderizara de una manera especifiac

}
