(ns demo.responsive
  (:require [reagent.core :as r]
            ["react-responsive" :as r-responsive]))

(def media-query (r/adapt-react-class r-responsive/default))
