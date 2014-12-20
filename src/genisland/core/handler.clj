(ns genisland.core.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [genisland.core.layout :as layout]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defn home-page []
  (layout/render "index.html"))

(defroutes app-routes
  (GET "/" [] (home-page))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
