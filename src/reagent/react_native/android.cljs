(ns reagent.react-native.android
  (:require [react-native :as rn]
            [reagent.core :as r]))

(def drawer-layout-android (r/adapt-react-class rn/DrawerLayoutAndroid))
(def touchable-native-feedback (r/adapt-react-class rn/TouchableNativeFeedback))
