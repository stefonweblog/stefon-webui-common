(ns stefon-webui-common.core
  (:require jig)
  (:import (jig Lifecycle)))


;; A Jig Component
(deftype Component [config]
  Lifecycle

  (init [_ system]

    #_(println ">> init CALLED > " (keys system))
    system)

  (start [_ system]

    #_(println ">> start CALLED > " (keys system))
    system)

  (stop [_ system]

    #_(println ">> stop CALLED > " (keys system))
    system))


(defn handle-hello-world [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "<h1>Hello World!</h1>"})
