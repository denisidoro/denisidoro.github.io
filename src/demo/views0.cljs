(ns demo.views0
  (:require [demo.subs :as subs]
            [re-com.core :as com]
            [demo.responsive :as responsive]))

(def left-column
  [com/box :child "left" :size "auto"])

(def right-column
  [com/box :child "right" :size "auto" :style {:background "blue"}])

(defn app-root []
  [:div
   [responsive/media-query {:minWidth 700}
    [com/h-box
     :height "100px"
     :width "100%"
     :children [left-column right-column]]]
   [responsive/media-query {:maxWidth 700}
    [com/v-box
     :height "100px"
     :width "100%"
     :children [left-column right-column]]]])
