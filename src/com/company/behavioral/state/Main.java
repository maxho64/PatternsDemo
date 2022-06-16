package com.company.behavioral.state;

import com.company.behavioral.state.ui.Player;
import com.company.behavioral.state.ui.UI;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
