(ns circles.core
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [cljs.core.async :as async]))

(enable-console-print!)

(println "Hello world!")

(def ctx (.getContext js/canvas "2d"))
(.fillRect ctx 0 0 100 100)

(def img (new js/Image "image.png"))
(aset img "src" "image.png")

(.drawImage ctx img 0 0)

(defn renderCircle [img text size]
  (do
    (.drawImage ctx img 0 0 size size)
    ))

(renderCircle img "hello" 100)


(go 42)
(go
 (<! (async/timeout 1000))
 (.log js/console "Hello")
 )

