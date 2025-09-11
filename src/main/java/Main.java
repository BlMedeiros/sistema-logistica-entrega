import view.EntregaView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EntregaView entregaView = new EntregaView(sc);

        entregaView.iniciar();
    }
}
