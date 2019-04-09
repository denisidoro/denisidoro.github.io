(ns demo.views
  (:require [demo.subs :as subs]
            [re-com.core :as com]
            [goog.string :as gstr]
            [demo.responsive :as responsive]))

(def header
  [com/box
   :child [:div {:style {:padding "4em"}}
           [:h1 {:style {:color "#FEFEFE" :font-weight "bold"}}
            "Denis Isidoro"]
           [:h3 {:style {:color "#FEFEFE"}}
            "Software engineer"]
           [:div {:style {:color "#FEFEFE"}}
            "Lorem ipsum dolor sit amet"]]
   :style {:border "2px solid red"}])

(defn one-education
  [school course period image-url]
  [:div {:style {:margin "40px 0px"}}
   [:div {:style {:background          "white"
                  :background-image    (str "url(\"" image-url "\")")
                  :background-position "center"
                  :background-repeat   "no-repeat"
                  :background-size     "70px 70px"
                  :width               "90px"
                  :height              "90px"
                  :border-radius       "1000px"}}]
   [:h5 {:style {:color       "#FEFEFE"
                 :margin-top  "20px"
                 :font-weight "bold"}} school]
   [:h6 {:style {:color "#DCDCDC"}} course]
   [:h6 {:style {:color "#FEFEFE"}} (into [:div] (interpose [:div {:style {:margin "-4px"}} [:br]] period))]])

(def details
  [com/box
   :child [:div {}
           [:h4 {:style {:color "#FEFEFE"}} "Details"]
           [one-education
            "Ecole Centrale Paris"
            "General Engineering"
            ["07/2013 - 06/2015"]
            "https://scontent-gru2-2.xx.fbcdn.net/v/t1.0-9/12118946_972342269490500_3523157011679797253_n.png?_nc_cat=110&_nc_ht=scontent-gru2-2.xx&oh=47496cf38e2bcc979c2c90d17c86bc7b&oe=5D3CD0A1"]
           [one-education
            "Universidade de São Paulo"
            "Electronic Engineering"
            ["02/2011 - 06/2013" "07/2015 - 12/2017"]
            "https://images.educamaisbrasil.com.br/content/superior/instituicao/logo/g/usp.png"]]
   :size "auto"
   :style {:border  "2px solid green"
           :padding "4em"}])

(def education
  [com/box
   :child "EDUCATION"
   :size "auto"
   :style {:border  "2px solid yellow"
           :padding "4em"}])

(def work
  [com/box
   :child "WORK"
   :size "auto"
   :style {:border  "2px solid blue"
           :padding "4em"}])

(def open-source
  [com/box
   :child "OPEN-SOURCE"
   :size "auto"
   :style {:border "2px solid cyan"}])

(def articles
  [com/box
   :child "ARTICLES"
   :size "auto"
   :style {:border "2px solid purple"}])

(defn app-root []
  [:div
   [com/v-box
    :height "80em"
    :width "100%"
    :children [header [com/h-box :size "auto" :children [details details]]]]])
