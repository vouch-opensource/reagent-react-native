(ns reagent.react-native.ios
  (:require [react-native :as rn]
            [reagent.core :as r]))

(def input-accessory-view (r/adapt-react-class rn/InputAccessoryView))
