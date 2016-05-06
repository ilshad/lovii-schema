(defproject lockedon/lovii-schema "0.2.4"
  :description "Describe your application schema using data."
  :url "https://github.com/LockedOn/lovii-schema"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.8.0"]
                                  [cheshire "5.5.0"]
                                  [prismatic/schema "1.0.5"]
                                  [com.datomic/datomic-free "0.9.5201" :exclusions [joda-time]]]
                   :plugins [[com.jakemccrary/lein-test-refresh "0.10.0"]]
                   :main lovii-schema.core}}
  :deploy-repositories [["releases" :clojars]])
