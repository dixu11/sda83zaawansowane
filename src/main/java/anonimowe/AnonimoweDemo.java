package anonimowe;

class AnonimoweDemo {
    public static void main(String[] args) {

        ButtonAction helloAction = new ButtonAction(){
            public void pushAction(){
                System.out.println("Hello");
            }
        };

        MyButton myButton = new MyButton("Login",helloAction );
        myButton.pushButton();

        MyButton myButton2 = new MyButton("exit", new ButtonAction() {
            @Override
            public void pushAction() {
                System.out.println("quit");
            }
        });

        myButton2.pushButton();
    }

    public static void sayHello() {
        System.out.println("Hello world");
    }
}


class MyButton{ // klasa odpowiedzialna za wyglad przycisku
    private String text;
    private ButtonAction buttonAction;

    MyButton(String text, ButtonAction buttonAction) {
        this.text = text;
        this.buttonAction = buttonAction;
    }

    public void pushButton() {
        buttonAction.pushAction();
    }
}
