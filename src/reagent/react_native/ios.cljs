(ns reagent.react-native.ios
  (:require [react-native :as rn]
            [reagent.core :as r]))

(def navigator (r/adapt-react-class rn/NavigatorIOS))
(def slider (r/adapt-react-class rn/SliderIOS))
(def switch (r/adapt-react-class rn/SwitchIOS))
(def tabs (r/adapt-react-class rn/TabBarIOS))
(def tabs-item (r/adapt-react-class (. rn/TabBarIOS -Item)))
