package com.mygdx.hastypastry.enums;

import com.mygdx.hastypastry.models.Game;
import com.mygdx.hastypastry.views.BaseView;
import com.mygdx.hastypastry.views.DrawView;
import com.mygdx.hastypastry.views.LobbyView;
import com.mygdx.hastypastry.views.MainMenuView;
import com.mygdx.hastypastry.views.PlayView;


public enum ScreenEnum {

    MAIN_MENU {
        public BaseView getScreen(Object... params) {
            return new MainMenuView();
        }
    },
    PLAY {
        public BaseView getScreen(Object... params) {
            return new PlayView((Game)params[0]);
        }
    },
    LOBBY {
        public BaseView getScreen(Object... params) {
            return new LobbyView((String)params[0]);
        }
    },
    DRAW {
        public BaseView getScreen(Object... params) {
            return new DrawView((Game)params[0]);
        }
    };

    public abstract BaseView getScreen(Object... params);
}
