(ns stefon-webui-common.core
  (:require jig)
  (:import (jig Lifecycle)))


;; A Jig Component
(deftype Component [config]
  Lifecycle

  (init [_ system]

    ;;(println ">> init CALLED > " system)
    system)

  (start [_ system]

    ;;(println ">> start CALLED > " system)
    system)

  (stop [_ system]

    ;;(println ">> stop CALLED > " system)
    system))


(defn handle-hello-world [Request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "<h1>Hello World!</h1>"})
