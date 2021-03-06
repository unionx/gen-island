(defproject genisland "0.1.0"
  :description "Gen island"
  :url "http://science.unionx.me"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.1"]
                 [selmer "0.7.7"]
                 [environ "1.0.0"]
                 [ring/ring-defaults "0.1.2"]]
  :plugins [[lein-ring "0.8.13"]
            [lein-environ "1.0.0"]]
  :ring {:handler genisland.core.handler/app
         :uberwar-name "genisland.war"
         :auto-reload? true
         :auto-refresh? true}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
