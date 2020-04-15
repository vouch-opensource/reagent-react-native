(ns reagent.react-native
  (:require [react-native :as rn]
            [reagent.core :as r]))

(def image (r/adapt-react-class rn/Image))
(def input (r/adapt-react-class rn/TextInput))
(def list-view (r/adapt-react-class rn/ListView))
(def scroll (r/adapt-react-class rn/ScrollView))
(def text (r/adapt-react-class rn/Text))
(def touchable-highlight (r/adapt-react-class rn/TouchableHighlight))
(def view (r/adapt-react-class rn/View))
