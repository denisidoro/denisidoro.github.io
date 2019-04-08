(ns demo.views
  (:require [demo.routes :as routes]
            [demo.subs :as subs]
            [re-frame.core :as re-frame]
            [reagent.core :as r]
            [re-com.core :as com]
            ["react-responsive" :as responsive]))

(def media-query (r/adapt-react-class responsive/default))

(def left-column
  [com/box :child "left" :size "auto" :style {:background "red"}])

(def right-column
  [com/box :child "right" :size "auto" :style {:background "blue"}])

(defn app-root []
  [:div
   [media-query {:minWidth 700}
    [com/h-box
     :height "100px"
     :width "100%"
     :children [left-column right-column]]]
   [media-query {:maxWidth 700}
    [com/v-box
     :height "100px"
     :width "100%"
     :children [left-column right-column]]]])
